package com.gafker.manage.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.gafker.manage.mapper.FamilyphotoMapper;
import com.gafker.manage.pojo.Familyphoto;
import com.gafker.manage.pojo.FamilyphotoExample;
import com.gafker.manage.pojo.Familytraceability;
import com.gafker.manage.pojo.FamilyphotoExample.Criteria;
import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.file.UploadedFile;
import com.gafker.manage.pojo.form.FamilyphotoForm;
import com.gafker.manage.pojo.form.FamilytraceabilityForm;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FileService;
import com.gafker.manage.service.utils.FileUtils;

@Service
public class FamilyPhotoUploadServiceImpl implements FileService {
	private static final Logger logger1 = LogManager.getLogger(FamilyPhotoUploadServiceImpl.class);
	@Value("${upload.file.path.root}")
	private String savePath;

	@Value("${upload.file.record.root}")
	private String showPath;

	@Value("${qrcode.file.show.prefix}")
	private String qrcodePathPrefix;

	@Autowired
	FamilyphotoMapper familyphotoMapper;

	@Override
	@Caching(evict = { @CacheEvict(value = { "photoList" }, key = "'all_photoList_list'") })
	public String saveFile(UploadedFile m, HttpServletRequest request) {
		Userattribute user = (Userattribute) request.getSession().getAttribute("user");
		Long userId = (null != user && null != user.getId()) ? user.getId() : 0l;
		MultipartFile file = m.getMultipartFile();
		String filename = file.getOriginalFilename();
		// 2017/3/xxx.jpg /fileUpload/2017/3/xxx.jpg
		String uuidFullName = FileUtils.getUuidFullName(filename,savePath);
		try {
			// d:/fileUpload/2017/3/xxx.jpg /fileUpload/2017/3/xxx.jpg
			String saveRealPath = savePath + uuidFullName;
			File f = new File(saveRealPath);
			file.transferTo(f);
			logger1.info("-------保存位置：" + saveRealPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String recordpth = showPath + uuidFullName;
		Familyphoto r = new Familyphoto();
		r.setRawname(m.getMultipartFile().getOriginalFilename());
		r.setFilename(recordpth);
		r.setStar(1l);
		r.setPoint(1l);
		r.setUploadtime(new Date());
		r.setUploaduser(userId);
		familyphotoMapper.insertSelective(r);
		// http://127.0.0.1:8080/fileupload/2017/03/49aa94835f1540c68ffb9ce75b7cd56d.jpg
		String showRealPath = qrcodePathPrefix + recordpth;
		return showRealPath;
	}

	@Override
	@Cacheable(value = "photoList", key = "'all_photoList_list'")
	public List<Familyphoto> showAllPhoto(Familyphoto p) {
		FamilyphotoExample c = new FamilyphotoExample();
		c.setOrderByClause("id DESC");
		List<Familyphoto> photoList = familyphotoMapper.selectByExample(c);
		this.setPrefix(photoList);
		return photoList;
	}

	// 设置图片显示前缀
	private void setPrefix(List<Familyphoto> photoList) {
		if (null != photoList && photoList.size() > 0) {
			for (Familyphoto p1 : photoList) {
				p1.setFilename(qrcodePathPrefix + p1.getFilename());
			}
		}
	}

	@Override
	public boolean isExistPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int save(FamilyphotoForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(FamilyphotoForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(FamilyphotoForm record, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<FamilyphotoForm> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(FamilyphotoForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(FamilyphotoForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(FamilyphotoForm record, FamilyphotoForm con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<FamilyphotoForm> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FamilyphotoForm selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FamilyphotoForm selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilyphotoForm> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FamilyphotoForm findByCondition(FamilyphotoForm c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilyphotoForm> listByCondition(FamilyphotoForm c) throws Exception {
		FamilyphotoExample ce = new FamilyphotoExample();
		Criteria cr = ce.createCriteria();
		cr.andUploaduserEqualTo(c.getId());
		ce.setOrderByClause("id DESC");
		List<Familyphoto> list = familyphotoMapper.selectByExample(ce);
		return this.totraceFormList(list);
	}
	
	private List<FamilyphotoForm> totraceFormList(List<Familyphoto> traceList)
			throws IllegalAccessException, InvocationTargetException {
		List<FamilyphotoForm> resultList=null;
		if(null!=traceList && traceList.size()>0){
			resultList=new ArrayList<FamilyphotoForm>();
			for(Familyphoto result:traceList){
				FamilyphotoForm orig=new FamilyphotoForm();
				BeanUtils.copyProperties(orig, result);
				resultList.add(orig);
			}
		}
		return resultList;
	}

	@Override
	public List<FamilyphotoForm> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilyphotoForm> listPageByCondition(FamilyphotoForm cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilyphotoForm> listPageByConditon(FamilyphotoForm cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(FamilyphotoForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(FamilyphotoForm con) throws Exception {
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
	public int countByCondition(FamilyphotoForm con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(FamilyphotoForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
