package com.gafker.manage.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.entity.Familygeneration;
import com.gafker.manage.entity.FamilygenerationExample;
import com.gafker.manage.entity.Page;
import com.gafker.manage.mapper.FamilygenerationMapper;
import com.gafker.manage.service.FamilygenerationService;

@Service
@Transactional
public class FamilygenerationImpl implements FamilygenerationService {

	private static Logger logger1 = LogManager.getLogger(FamilygenerationImpl.class);
	
	@Autowired
	FamilygenerationMapper familygenerationMapper;

	@Override
	public int save(Familygeneration record) throws Exception {
		record.setUpdatetime(new Date());
		record.setCreatetime(new Date());
		int insert = familygenerationMapper.insert(record);
		return insert;
	}

	@Override
	public int saveSelective(Familygeneration record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<Familygeneration> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Familygeneration record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(Familygeneration record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(Familygeneration record, FamilygenerationExample con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<Familygeneration> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Familygeneration selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Familygeneration selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familygeneration> listAll() throws Exception {
		List<Familygeneration> genList = familygenerationMapper.selectByExample(null);
		return genList;
	}

	@Override
	public Familygeneration findByCondition(FamilygenerationExample c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familygeneration> listByCondition(FamilygenerationExample c) throws Exception {
		List<Familygeneration> genList = familygenerationMapper.selectByExample(c);
		return genList;
	}

	@Override
	public List<Familygeneration> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familygeneration> listPageByCondition(FamilygenerationExample cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familygeneration> listPageByConditon(FamilygenerationExample cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Familygeneration record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(FamilygenerationExample con) throws Exception {
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
	public int countByCondition(FamilygenerationExample con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(Familygeneration record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Familygeneration record, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isExistPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
