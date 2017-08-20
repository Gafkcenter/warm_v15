package com.gafker.manage.serviceImpl;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.Phonecvfpath;
import com.gafker.manage.entity.PhonecvfpathExample;
import com.gafker.manage.mapper.PhonecvfpathMapper;
import com.gafker.manage.pojo.PhonecvfpathForm;
import com.gafker.manage.service.PhonecvfpathService;

@Service
@Transactional
public class PhonecvfpathServiceImpl implements PhonecvfpathService {
	private static final Logger LOGGER = LogManager.getLogger(PhonecvfpathServiceImpl.class);

	@Autowired
	PhonecvfpathMapper phonecvfpathMapper;
	@Override
	public int save(PhonecvfpathForm s) throws Exception {
		int result = phonecvfpathMapper.insertSelective(s);
		return result;
	}

	@Override
	public int update(PhonecvfpathForm s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelect(PhonecvfpathForm s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhonecvfpathForm findByPrimaryId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonecvfpathForm> selectByExample(PhonecvfpathExample c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonecvfpathForm> selectByExample(PhonecvfpathExample c, Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonecvfpathForm> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonecvfpathForm> selectAll(Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(List<PhonecvfpathForm> s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhonecvfpathForm copyEntityToVoForm(Phonecvfpath entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhonecvfpathForm> copyEntityToVoForm(List<Phonecvfpath> entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
