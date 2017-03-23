package com.gafker.manage.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.gafker.manage.mapper.HappayteachersdaysMapper;
import com.gafker.manage.mapper.VisitorcountMapper;
import com.gafker.manage.mapper.VisitorlogMapper;
import com.gafker.manage.pojo.FileResponse;
import com.gafker.manage.pojo.Happayteachersdays;
import com.gafker.manage.pojo.HappayteachersdaysExample;
import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.pojo.request.HappayteachersdaysRequest;
import com.gafker.manage.service.HappayteachersdayService;
import com.gafker.manage.service.UserAttributeService;
import com.gafker.manage.service.utils.BarcodeFactory;
import com.gafker.manage.service.utils.CookiesUtil;
import com.gafker.manage.service.utils.FileUtils;

@Service("happayteachersdaysService")
@Transactional
public class HappayteachersdayServiceImpl implements HappayteachersdayService, InitializingBean {

	public static Logger logger1 = LogManager.getLogger(HappayteachersdayServiceImpl.class);

	@Resource
	private HappayteachersdaysMapper happayteachersdaysMapper;
	@Resource
	private VisitorlogMapper visitorlogMapper;
	@Resource
	private VisitorcountMapper visitorcountMapper;

	@Autowired
	private UserAttributeService userattributeService;

	@Value("${upload.file.path.root}")
	private String savePath;

	@Value("${qrcode.file.show.prefix}")
	private String qrcodePathPrefix;

	@Value("${upload.file.record.root}")
	private String recordRoot;

	@Value("${user.qrcode.login.place}")
	private String userLoginImages;

	@Value("${record.qrcode.warmsay.place}")
	private String warmsayImages;

	@Value("${upload.file.show.prefix}")
	private String showPrefix;

	@Value("${qrcode.url.warm.prefix}")
	private String warmPrefix;

	@Value("${qrcode.url.user.prefix}")
	private String userPrefix;

	@Value("${qrcode.jpg.record.suffix}")
	private String qrcodeRecordSuffix;

	@Value("${qrcode.jpg.user.suffix}")
	private String qrcodeUserSuffix;

	@Value("${default.images.name}")
	private String defaultImagesName;

	@Value("${default.login.password}")
	private String defaultPassword;

	@Value("${default.qrcode.size}")
	private int qrcodesize;

	@Value("${default.nick.name}")
	private String nickName;

	@Value("${default.qrcode.img.width}")
	private int qrcodeImageWidth;

	public static int QRCODE_IMAGES_WIDTH;

	public int saveInfo(HappayteachersdaysRequest record, HttpServletRequest req, HttpServletResponse res,
			MultipartFile files) throws Exception {
		String userId = null;
		/**
		 * 1.生成用户信息和用户二维码信息（如果用户没有登录或新用户）； 2.生成记录的二维码并保存。 3.分配用户默认组信息。
		 */
		// 默认图片的二维码地址，确保每个使用默认图片的码使用uuid文件名
		FileResponse filePath = FileUtils.setFileResponse(savePath, recordRoot, defaultImagesName);
		// 1.有上传祝福图片
		String warmfile = record.getWarmfile();
		if (null != files && files.getSize() > 0) {
			// 提供了Multipart File
			filePath = FileUtils.saveFile(req, files, savePath, recordRoot);
		} else if (null != warmfile && warmfile.length() > 0) {
			// 已经通过异步上传了文件
			filePath.setFileUUidFullName(savePath + warmfile);
			filePath.setFileUUidName(recordRoot + warmfile);
			filePath.setSourceFilePath(filePath.getFileUUidFullName());
			filePath.setFileOriginalFilename(null);
		}
		logger1.debug(filePath.toString());
		Userattribute user = new Userattribute();
		Cookie[] cookies = req.getCookies();
		Boolean exist = false;
		if (cookies.length > 0) {
			for (Cookie cookiex : cookies) {
				Boolean boo = "userId".equals(cookiex.getName()) && !"".equals(cookiex.getValue());
				if (boo) {
					userId = cookiex.getValue();
					exist = true;
					break;
				}
			}
		}
		if (!exist) {
			// 2 用户没有Cookie记录就新增用户 3 生成用户登录二维码
			userId = registUser(record, req, res, files, filePath, user);
		}
		// 保存
		record.setImagespath(filePath.getFileUUidName());
		record.setGoodpoints(1l);
		record.setCreatetime(new Date());
		record.setIsshow(0);
		int result = happayteachersdaysMapper.insert(record);
		// 4.生成记录二维码，按规格生成，上传图片uuid完整名+qrcode.jpg
		String warmqrcode = warmPrefix.replace("%", record.getId().toString()).replace("@", userId);
		// 有图分享二维码。
		try {
			BarcodeFactory.encode(warmqrcode, qrcodesize, qrcodesize, filePath.getSourceFilePath(),
					filePath.getFileUUidFullName() + qrcodeRecordSuffix);
		} catch (Exception e) {
			BarcodeFactory.nowhitecode(warmqrcode, qrcodesize, qrcodesize,
					filePath.getFileUUidFullName() + qrcodeRecordSuffix);
		}
		if (filePath.getFileOriginalFilename() != null)
			record.setImagespath(recordRoot + filePath.getFileOriginalFilename());
		record.setQrcode(filePath.getFileUUidName() + qrcodeRecordSuffix);
		happayteachersdaysMapper.updateByPrimaryKeySelective(record);
		return result;
	}

	private String registUser(HappayteachersdaysRequest record, HttpServletRequest req, HttpServletResponse res,
			MultipartFile files, FileResponse filePath, Userattribute user) throws Exception {
		String userqrcode = filePath.getFileUUidFullName() + qrcodeUserSuffix;
		user.setCreatetime(new Date());
		user.setUpdatetime(new Date());
		user.setUserqrcode(filePath.getFileUUidName() + qrcodeUserSuffix);
		user.setUsername(record.getStudents());
		user.setPassword(defaultPassword);
		user.setHeadimage(recordRoot + defaultImagesName);
		Userattribute c=new Userattribute();
		c.setUsername(user.getUsername());
		Userattribute userattribute = userattributeService.findByCondition(c);
		if(null == userattribute){
			userattributeService.saveInfo(user, req, res, files);
			req.getSession().setAttribute("user", user);
			String urlQrcode = userPrefix.replace("%", user.getId().toString());
			// 3.生成新用户二维码
			BarcodeFactory.encode(urlQrcode, qrcodesize, qrcodesize, filePath.getFileUUidFullName(), userqrcode);
		}else{
			user.setId(userattribute.getId());
			user.setQrcode(userattribute.getQrcode());
			req.getSession().setAttribute("user", userattribute);
		}
		CookiesUtil.setCookies(user.getUsername(), req, res, user.getId().toString());
		CookiesUtil.setCookie(res, "user", user.toString(), "/");
		record.setStudents(user.getId().toString());
		return user.getId().toString();
	}

	public int updateInfo(HappayteachersdaysRequest record) {
		Happayteachersdays result = new Happayteachersdays();
		result = happayteachersdaysMapper.selectByPrimaryKey(record.getId());
		result.setGoodpoints(result.getGoodpoints() + 1);
		result.setUpdatetime(new Date());
		int updateByPrimaryKey = happayteachersdaysMapper.updateByPrimaryKey(result);
		return updateByPrimaryKey;
	}

	public List<Happayteachersdays> listTop20() {
		List<Happayteachersdays> data = happayteachersdaysMapper.selectAll();
		return data;
	}

	public List<Happayteachersdays> listPage(Page page) {
		List<Happayteachersdays> data = happayteachersdaysMapper.selectPage(page);
		return data;
	}

	public List<Happayteachersdays> listTop20Example(Long id, HappayteachersdaysExample example,
			HappayteachersdaysRequest recordRequest) throws NumberFormatException, Exception {
		List<Happayteachersdays> data = happayteachersdaysMapper.selectByExample(example);
		this.setImageOrQrcodePrefix(data);
		return data;
	}

	private void setImageOrQrcodePrefix(List<Happayteachersdays> data) throws Exception {
		Userattribute user;
		if (data != null) {
			for (Happayteachersdays d : data) {
				user = userattributeService.selectByPrimaryKey(Long.valueOf(d.getStudents()));
				d.setStudents(nickName);
				if (user != null) {
					d.setStudents(user.getUsername());
				}
				d.setImagespath(qrcodePathPrefix + d.getImagespath());
				d.setQrcode(qrcodePathPrefix+d.getQrcode());
			}

		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		QRCODE_IMAGES_WIDTH = qrcodeImageWidth;

	}
}
