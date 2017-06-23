package com.gafker.manage.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.entity.Familynames;
import com.gafker.manage.entity.FamilynamesExample;
import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.FamilynamesExample.Criteria;
import com.gafker.manage.mapper.FamilynamesMapper;
import com.gafker.manage.service.FamilynamesService;

@Service
@Transactional
public class FamilynamesServiceImpl implements FamilynamesService {
	public static Logger logger1 = LogManager.getLogger(FamilynamesServiceImpl.class);

	@Autowired
	private FamilynamesMapper familynamesMapper;

	@Override
	public int save(Familynames record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Familynames record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<Familynames> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Familynames record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(Familynames record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(Familynames record, Familynames con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<Familynames> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Familynames selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Familynames selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familynames> listAll() throws Exception {
		FamilynamesExample con=new FamilynamesExample();
		con.setOrderByClause("ChinesePhonetic ASC");
		List<Familynames> namesList = familynamesMapper.selectByExample(con);
		return namesList;
	}

	@Override
	public List<Familynames> listByCondition(Familynames c) throws Exception {
		FamilynamesExample example = new FamilynamesExample();
		Criteria criteria = example.createCriteria();
		criteria.andNamecnEqualTo(c.getNamecn());
		List<Familynames> nameList = familynamesMapper.selectByExample(example);
		return nameList;
	}

	@Override
	public List<Familynames> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familynames> listPageByCondition(Familynames cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familynames> listPageByConditon(Familynames cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Familynames record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(Familynames con) throws Exception {
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
	public int countByCondition(Familynames con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(Familynames record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Familynames findByCondition(Familynames c) throws Exception {
		FamilynamesExample example = new FamilynamesExample();
		Criteria criteria = example.createCriteria();
		criteria.andNamecnEqualTo(c.getNamecn());
		List<Familynames> namesList = familynamesMapper.selectByExample(example);
		if (namesList.isEmpty()){
			return null;
		}
			return namesList.get(0);
	}

	@Override
	public int saveSelective(Familynames record, HttpServletRequest request, HttpServletResponse response)
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
