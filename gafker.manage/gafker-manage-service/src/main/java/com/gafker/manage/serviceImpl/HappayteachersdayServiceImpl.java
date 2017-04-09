package com.gafker.manage.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
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
		Userattribute c = null;
		String userId = "0";
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
		// 查出发送者接收者id.
		c = new Userattribute();
		c.setUsername(record.getTeachers());
		c = userattributeService.findByCondition(c);
		if (c != null)
			record.setTeachers(c.getId().toString());
		c = new Userattribute();
		c.setUsername(record.getStudents());
		c = userattributeService.findByCondition(c);
		if (c != null)
			record.setStudents(c.getId().toString());
		// 保存
		record.setImagespath(filePath.getFileUUidName());
		record.setGoodpoints(1l);
		record.setCreatetime(new Date());
		record.setIsshow(0);
		int result = happayteachersdaysMapper.insert(record);
		// 4.生成记录二维码，按规格生成，上传图片uuid完整名+qrcode.jpg
		userId = c.getId().toString();
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
		Userattribute userStudent;
		Userattribute userTeacher;
		if (data != null) {
			for (Happayteachersdays d : data) {
				long studentId = 0,teacherId=0;
				try {
					studentId = Long.valueOf(d.getStudents());
					teacherId = Long.valueOf(d.getTeachers());
				} catch (Exception e) {
					continue;
				}
				userStudent = userattributeService.selectByPrimaryKey(studentId);
				userTeacher = userattributeService.selectByPrimaryKey(teacherId);
				d.setStudents(nickName);
				if (userStudent != null) {
					d.setStudents(userStudent.getUsername());
				}
				if (userTeacher != null) {
					d.setTeachers(userTeacher.getUsername());
				}
				d.setImagespath(qrcodePathPrefix + d.getImagespath());
				d.setQrcode(qrcodePathPrefix + d.getQrcode());
			}

		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		QRCODE_IMAGES_WIDTH = qrcodeImageWidth;

	}
}
