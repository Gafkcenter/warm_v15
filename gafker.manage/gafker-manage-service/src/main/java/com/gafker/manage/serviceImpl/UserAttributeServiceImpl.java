package com.gafker.manage.serviceImpl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.gafker.common.tools.CryptographyUtil;
import com.gafker.manage.mapper.UserattributeMapper;
import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.UserattributeExample;
import com.gafker.manage.pojo.UserattributeExample.Criteria;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.UserAttributeService;
import com.gafker.manage.service.utils.BarcodeFactory;
import com.gafker.manage.service.utils.FileUtils;
import com.google.zxing.WriterException;

@Transactional
@Service
public class UserAttributeServiceImpl implements UserAttributeService {

	@Autowired
	UserattributeMapper userattributeMapper;
	@Value("${default.qrcode.size}")
	private int qrcodesize;

	@Value("${qrcode.url.user.prefix}")
	private String userPrefix;

	@Value("${upload.file.path.root}")
	private String savePath;

	@Value("${upload.file.record.root}")
	private String recordRoot;

	@Value("${qrcode.file.show.prefix}")
	private String qrcodePathPrefix;

	@Value("${default.login.password}")
	private String defaultPassword;

	@Override
	public int saveInfo(Userattribute user, HttpServletRequest req, HttpServletResponse res, MultipartFile files)
			throws Exception {
		String uuidFullName = FileUtils.getUuidFullName("demo.png", savePath);
		user.setQrcode(uuidFullName);
		String userPassword = user.getPassword();
		if (userPassword == null)
			user.setPassword(defaultPassword);
		String md5Password = CryptographyUtil.md5(user.getPassword(), null);
		user.setPassword(md5Password);
		if(user.getFamilynamesFk()==null)
			user.setFamilynamesFk(505l);
		user.setCreatetime(new Date());
		user.setUpdatetime(new Date());
		int insert = userattributeMapper.insert(user);
		this.generaterQrcodeImage(user, uuidFullName);
		return insert;
	}

	private void generaterQrcodeImage(Userattribute user, String uuidFullName) throws IOException, WriterException {
		String urlQrcode = userPrefix.replace("%", user.getId().toString());
		String saveQrcodePath = savePath + uuidFullName;
		BarcodeFactory.nowhitecode(urlQrcode, qrcodesize, qrcodesize, saveQrcodePath);
	}

	@Override
	public int qrcodeInfo(Userattribute user, HttpServletRequest req, HttpServletResponse res, MultipartFile files)
			throws Exception {
		userattributeMapper.updateByPrimaryKey(user);
		return 0;
	}

	@Override
	@Cacheable(value = "family_user", key = "'user'+#id")
	public Userattribute selectByPrimaryKey(Long id) {
		Userattribute user = userattributeMapper.selectByPrimaryKey(id);
		if (user != null) {
			user.setUserqrcode(qrcodePathPrefix + user.getUserqrcode());
		}
		return user;
	}

	@Override
	public void updateUserShareTimes(Userattribute user) {
		userattributeMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int save(Userattribute record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Userattribute record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<Userattribute> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@CacheEvict(value = "family_user", key = "'user'+#record.id")
	public int updateByPrimaryKey(Userattribute record) throws Exception {
		String qrcode = recordRoot + record.getQrcode();
		record.setQrcode(qrcode);
		record.setUserqrcode(qrcode);
		record.setUpdatetime(new Date());
		int result = userattributeMapper.updateByPrimaryKeySelective(record);
		return result;
	}

	@Override
	public int updateSelective(Userattribute record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(Userattribute record, Userattribute con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<Userattribute> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Userattribute selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Userattribute> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Userattribute findByCondition(Userattribute c) throws Exception {
		UserattributeExample example = new UserattributeExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(c.getUsername());
		List<Userattribute> userlist = userattributeMapper.selectByExample(example);
		if (userlist.size() > 0) {
			return userlist.get(0);
		}
		return null;
	}

	@Override
	public List<Userattribute> listByCondition(Userattribute c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Userattribute> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Userattribute> listPageByCondition(Userattribute cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Userattribute> listPageByConditon(Userattribute cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Userattribute record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(Userattribute con) throws Exception {
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
	public int countByCondition(Userattribute con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(Userattribute record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Userattribute record, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isExistPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 * @param username
	 * @return true 用户已经有了,false 没有这个用户
	 * @throws Exception
	 */
	@Override
	public boolean isUserExist(String username) throws Exception {
		Boolean isexist = false;
		if (null != username && !username.trim().equals("")) {
			Userattribute c = new Userattribute();
			c.setUsername(username);
			Userattribute user = this.findByCondition(c);
			if (null != user && !user.getUsername().equals(""))
				isexist = true;
		}
		return isexist;
	}

	@Override
	public Userattribute setUserContactPhone(Long id) throws Exception {
		Userattribute user = userattributeMapper.selectByPrimaryKey(id);
		if (user != null && !(user.getPhonenum() != null)) {
			user.setPhonenum("18133064619");
		}
		return user;
	}

}
