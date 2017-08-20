package com.gafker.manage.serviceImpl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.common.tools.RandomUtils;
import com.gafker.manage.datatype.Qrcode;
import com.gafker.manage.entity.Familyproduct;
import com.gafker.manage.entity.FamilyproductExample;
import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.Userattribute;
import com.gafker.manage.mapper.FamilyproductMapper;
import com.gafker.manage.pojo.FamilyproductForm;
import com.gafker.manage.service.FamilyproductService;
import com.gafker.manage.service.utils.BarcodeFactory;
import com.gafker.manage.service.utils.FileUtils;
import com.gafker.manage.service.utils.JSonUtils;
import com.gafker.manage.service.utils.JedisUtils;
import com.gafker.manage.service.utils.JedisUtils.Strings;
import com.gafker.manage.vo.FileResponse;

@Service
@Transactional
public class FamilyproductServiceImpl implements FamilyproductService {
	private static final Logger logger1 = LogManager.getLogger(FamilyproductServiceImpl.class);
	@Autowired
	FamilyproductMapper familyproductMapper;

	@Value("${upload.file.path.root}")
	private String hardDiskSavePath;

	@Value("${upload.file.record.root}")
	private String dbSavePath;

	@Value("${qrcode.product.prefix}")
	private String productPrefix;

	@Value("${qrcode.product.tracea}")
	private String productTraceaPrefix;

	@Value("${default.qrcode.size}")
	private int qrcodesize;

	@Value("${qrcode.jpg.record.suffix}")
	private String qrcodeRecordSuffix;

	@Value("${default.images.name}")
	private String defaultImagesName;

	@Value("${qrcode.file.show.prefix}")
	private String qrcodePathPrefix;
	@Value("${qrcode.jpg.tracea.suffix}")
	private String traceaSuffix;

	@Override
	public int save(FamilyproductForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(FamilyproductForm record) throws Exception {
		return 0;
	}

	@Override
	public int saveSelective(FamilyproductForm record, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Userattribute user = (Userattribute) request.getSession().getAttribute("user");
		if (null == user) {
			user = new Userattribute();
			user.setId(0l);
		}
		// 1.上传文件
		List<FileResponse> saveMoreFile = FileUtils.saveMoreFile(record.getImages(), hardDiskSavePath, dbSavePath);
		boolean nofile = saveMoreFile.isEmpty();
		//hadDiskSaveFullPath保存上传产品第一张图片硬盘保存路径,随后用于该图用于生成带图的二维码
		//dbSaveFullPath 第一张图片硬盘保存路径在数据库保存的相对路径
		String filesString, defaultImages = null, hadDiskSaveFullPath = null, dbSaveFullPath = null; 
		if (!nofile) {
			hadDiskSaveFullPath = saveMoreFile.get(0).getFileUUidFullName();
			dbSaveFullPath = saveMoreFile.get(0).getFileUUidName();
			StringBuffer sb = new StringBuffer();
			for (FileResponse fileResoponse : saveMoreFile) {
				sb.append(fileResoponse.getFileUUidName());
				sb.append(",");
			}
			filesString = sb.toString();
			record.setDefaultimages(saveMoreFile.get(0).getFileUUidFullName());
			record.setImageslistobj(filesString);
		}
		if (null == hadDiskSaveFullPath) {
			hadDiskSaveFullPath = hardDiskSavePath + defaultImagesName;
			dbSaveFullPath = dbSavePath + defaultImagesName;
		}
		// 2.保存产品信息
		if (null != user) {
			record.setCreateby(user.getId());
		}
		Date date = new Date();
		record.setCreatetime(date);
		record.setUpdatetime(date);
		record.setDefaultimages(dbSaveFullPath);
		// 单号格式：模块代码2+订单代码2+(日期yyyyMMdd8+8位随机数)
		record.setUstringid(RandomUtils.getMillsRandom8IntNumber("mmoo"));
		int result = familyproductMapper.insertSelective(record);
		// 3.生成产品码和溯源码(第一个图片)
		// 产品码product/{@userId}/{%productId}
		// 有图产品码
		String productQrcode = productPrefix.replace("%", record.getId().toString()).replace("@",
				user.getId().toString());
		String qrCodepath = hadDiskSaveFullPath + qrcodeRecordSuffix;
		String qrCodeTraceaPath = hadDiskSaveFullPath + traceaSuffix;
		BarcodeFactory.encode(productQrcode, qrcodesize, qrcodesize, hadDiskSaveFullPath, qrCodepath);
		// 产品溯源码product/{%productId}/tracea
		// 无图无白边产品溯源吗。
		String productTraceaQrcode = productTraceaPrefix.replace("%", record.getId().toString());
		BarcodeFactory.nowhitecode(productTraceaQrcode, qrcodesize, qrcodesize, qrCodeTraceaPath);
		logger1.info("产品码:" + productQrcode + " ~~~ 产品溯源码:" + productTraceaQrcode);
		// 4.更溯源码信息进产品库
		Map<String, Qrcode> dataQrcode = new HashMap<String, Qrcode>();
		dataQrcode.put("product", new Qrcode(dbSaveFullPath+qrcodeRecordSuffix, productQrcode, "产品介绍"));
		dataQrcode.put("productTracea", new Qrcode(dbSaveFullPath+traceaSuffix, productTraceaQrcode, "产品溯源介绍"));
		record.setQrcode(JSonUtils.fromQrcode(dataQrcode));
		record.setUpdatetime(new Date());
		record.setUpdateby(user.getId());
		JedisUtils jedisUtils = JedisUtils.getInstance();
		Strings strings = jedisUtils.new Strings();
		strings.set("dataQrcode", JSonUtils.fromQrcode(dataQrcode));
		logger1.info(strings.get("dataQrcode"));
		result = familyproductMapper.updateByPrimaryKeySelective(record);
		return result;
	}

	@Override
	public int saveBatch(List<FamilyproductForm> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(FamilyproductForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(FamilyproductForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(FamilyproductForm record, FamilyproductExample con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<FamilyproductForm> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@Cacheable(value="family_product",key="'product'+#id")
	public Familyproduct selectByPrimaryKey(Long id) throws Exception {
		return familyproductMapper.selectByPrimaryKey(id);
	}

	@Override
	public Familyproduct selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familyproduct> listAll() throws Exception {
		FamilyproductExample example=new FamilyproductExample();
		example.setOrderByClause("id DESC");
		List<Familyproduct> data = familyproductMapper.selectByExample(example);
		return data;
	}

	@Override
	public Familyproduct findByCondition(FamilyproductExample c) throws Exception {
		List<Familyproduct> list = familyproductMapper.selectByExample(c);
		boolean empty = list.size() > 0;
		if (!empty)
			return null;
		Familyproduct product = list.get(0);
		this.setPathPrefix(product);
		return product;
	}

	@Override
	public List<Familyproduct> listByCondition(FamilyproductExample c) throws Exception {
		List<Familyproduct> productList = familyproductMapper.selectByExample(c);
		this.setPathPrefix(productList);
		return productList;
	}

	@Override
	public List<Familyproduct> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familyproduct> listPageByCondition(FamilyproductExample cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familyproduct> listPageByConditon(FamilyproductExample cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(FamilyproductForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(FamilyproductExample con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBatch(List<? extends Number> ids) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countByCondition(FamilyproductExample con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(FamilyproductForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isExistPrimaryKey(Long id) throws Exception {
		Boolean isExist = false;
		FamilyproductExample c = new FamilyproductExample();
		c.createCriteria().andIdEqualTo(id);
		Familyproduct result = this.findByCondition(c);
		if (null != result) {
			isExist = true;
		}
		return isExist;
	}

	private void setPathPrefix(List<Familyproduct> productList) {
		if (null != productList && productList.size() > 0) {
			for (Familyproduct product : productList) {
				this.setPathPrefix(product);
			}
		}
	}

	private void setPathPrefix(Familyproduct product) {
		String[] images = product.getImageslistobj().split(",");
		for (int i = 0; i < images.length; i++) {
			images[i] = qrcodePathPrefix + images[i];
		}
		product.setDefaultimages(images[0]);
		String qrcodes = product.getQrcode();
		if (null != qrcodes) {
			Map<String, Qrcode> arcode = JSonUtils.fromQrcodeString(product.getQrcode());
			product.setQrcode(qrcodePathPrefix + arcode.get("product").getQrCodeImage());// 溯源码
			product.setQrtracea(qrcodePathPrefix + arcode.get("productTracea").getQrCodeImage());// 溯源码
			product.setImageslistobj(StringUtils.join(images, ","));
		}
	}
}
