package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.entity.Familycalendar;
import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.Phoneuseuser;
import com.gafker.manage.entity.PhoneuseuserExample;
import com.gafker.manage.pojo.FamilycalendarForm;
import com.gafker.manage.pojo.PhoneuseuserForm;
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
	public List<PhoneuseuserForm> selectByExample(PhoneuseuserExample c, Page<?> p) throws Exception {
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

	@Override
	public PhoneuseuserForm copyEntityToVoForm(Phoneuseuser entity) throws Exception {
		PhoneuseuserForm dest = null;
		if (entity != null) {
			dest = new PhoneuseuserForm();
			BeanUtils.copyProperties(dest, entity);
		}
		return dest;
	}

	@Override
	public List<PhoneuseuserForm> copyEntityToVoForm(List<Phoneuseuser> entity) throws Exception {
		List<PhoneuseuserForm> desc = null;
		if (!CollectionUtils.isEmpty(entity)) {
			desc = new ArrayList<PhoneuseuserForm>();
			for (Phoneuseuser en : entity)
				desc.add(this.copyEntityToVoForm(en));
		}
		return desc;
	}

}
