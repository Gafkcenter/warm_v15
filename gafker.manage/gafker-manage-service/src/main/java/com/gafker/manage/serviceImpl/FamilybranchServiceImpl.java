package com.gafker.manage.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.mapper.FamilybranchMapper;
import com.gafker.manage.pojo.Familybranch;
import com.gafker.manage.pojo.FamilybranchExample;
import com.gafker.manage.pojo.FamilybranchExample.Criteria;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FamilybranchService;

@Service
@Transactional
public class FamilybranchServiceImpl implements FamilybranchService {

	@Autowired
	FamilybranchMapper familybranchMapper;

	@Override
	public int save(Familybranch record) throws Exception {
		record.setCreatetime(new Date());
		int insert = familybranchMapper.insert(record);
		return insert;
	}

	@Override
	public int saveSelective(Familybranch record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<Familybranch> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Familybranch record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(Familybranch record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(Familybranch record, Familybranch con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<Familybranch> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Familybranch selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Familybranch selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familybranch> listAll() throws Exception {
		List<Familybranch> branchList = familybranchMapper.selectByExample(null);
		return branchList;
	}

	@Override
	public Familybranch findByCondition(Familybranch c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familybranch> listByCondition(Familybranch c) throws Exception {
		FamilybranchExample example = new FamilybranchExample();
		Criteria criteria = example.createCriteria();
		criteria.andFamilynameidEqualTo(c.getFamilynameid());
		List<Familybranch> oneBranchList = familybranchMapper.selectByExample(example);
		return oneBranchList;
	}

	@Override
	public List<Familybranch> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familybranch> listPageByCondition(Familybranch cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Familybranch> listPageByConditon(Familybranch cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Familybranch record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(Familybranch con) throws Exception {
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
	public int countByCondition(Familybranch con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(Familybranch record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Familybranch record, HttpServletRequest request, HttpServletResponse response)
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
