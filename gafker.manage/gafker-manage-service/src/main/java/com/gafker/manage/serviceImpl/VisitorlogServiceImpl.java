package com.gafker.manage.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.Visitorlog;
import com.gafker.manage.mapper.VisitorlogMapper;
import com.gafker.manage.service.VisitorlogService;

@Service
public class VisitorlogServiceImpl implements VisitorlogService {

	@Autowired
	VisitorlogMapper visitorlogMapper;

	@Override
	public int save(Visitorlog record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Visitorlog record) throws Exception {
		int insert = visitorlogMapper.insertSelective(record);
		return insert;
	}

	@Override
	public int saveBatch(List<Visitorlog> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Visitorlog record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(Visitorlog record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(Visitorlog record, Visitorlog con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<Visitorlog> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Visitorlog selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitorlog selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorlog> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitorlog findByCondition(Visitorlog c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorlog> listByCondition(Visitorlog c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorlog> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorlog> listPageByCondition(Visitorlog cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorlog> listPageByConditon(Visitorlog cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Visitorlog record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(Visitorlog con) throws Exception {
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
	public int countByCondition(Visitorlog con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(Visitorlog record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Visitorlog record, HttpServletRequest request, HttpServletResponse response)
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
