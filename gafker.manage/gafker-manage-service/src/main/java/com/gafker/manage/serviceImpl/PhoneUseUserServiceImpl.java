package com.gafker.manage.serviceImpl;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.pojo.PhoneuseuserExample;
import com.gafker.manage.pojo.form.PhoneuseuserForm;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.PhoneUseUserService;

@Service
@Transactional
public class PhoneUseUserServiceImpl implements PhoneUseUserService {
public static final Logger LOGGER = LogManager.getLogger(PhoneUseUserServiceImpl.class);
	@Override
	public int save(PhoneuseuserForm s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(PhoneuseuserForm s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelect(PhoneuseuserForm s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhoneuseuserForm findByPrimaryId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneuseuserForm> selectByExample(PhoneuseuserExample c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneuseuserForm> selectByExample(PhoneuseuserExample c, Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneuseuserForm> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneuseuserForm> selectAll(Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(List<PhoneuseuserForm> s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
