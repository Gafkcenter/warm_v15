package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.mapper.FamilytraceabilityMapper;
import com.gafker.manage.pojo.Familyproduct;
import com.gafker.manage.pojo.Familytraceability;
import com.gafker.manage.pojo.FamilytraceabilityExample;
import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.form.FamilytraceabilityForm;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FamilyproductService;
import com.gafker.manage.service.FamilytraceabilityService;

@Service
@Transactional
public class FamilytraceabilityServiceImpl implements FamilytraceabilityService {

	@Autowired
	FamilytraceabilityMapper familytraceabilityMapper;
	
	@Autowired
	FamilyproductService familyproductService;

	@Override
	@CacheEvict(value="traceabilityList",key="'all_traceabilityList_list'")
	public int save(FamilytraceabilityForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	@CacheEvict(value="traceabilityList",key="'all_traceabilityList_list'")
	public int saveSelective(FamilytraceabilityForm record) throws Exception {
		record.setCreatetime(new Date());
		int result = familytraceabilityMapper.insertSelective(record);
		return result;
	}

	@Override
	@Caching(evict={
			@CacheEvict(value={"traceabilityList"},key="'all_traceabilityList_list'"),
			@CacheEvict(value={"traceabilityList"},key="'traceabilityList_'+#record.familyproductFk")
	})
	public int saveSelective(FamilytraceabilityForm record, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		record.setCreatetime(new Date());
		Userattribute user = (Userattribute)request.getSession().getAttribute("user");
		Long userId = null==user?0l:user.getId();
		record.setCreateby(userId);
		record.setCreatetime(new Date());
		int result = familytraceabilityMapper.insertSelective(record);
		return result;
	}

	@Override
	public int saveBatch(List<FamilytraceabilityForm> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(FamilytraceabilityForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(FamilytraceabilityForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(FamilytraceabilityForm record, FamilytraceabilityForm con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<FamilytraceabilityForm> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FamilytraceabilityForm selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FamilytraceabilityForm selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Cacheable(value="traceabilityList",key="'all_traceabilityList_list'")
	public List<FamilytraceabilityForm> listAll() throws Exception {
		FamilytraceabilityExample c=new FamilytraceabilityExample();
		c.setOrderByClause("id DESC");
		List<Familytraceability> traceList = familytraceabilityMapper.selectByExample(c);
		return this.totraceFormList(traceList);
	}

	@Override
	public FamilytraceabilityForm findByCondition(FamilytraceabilityForm c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Cacheable(value="traceabilityList",key="'traceabilityList_'+#form.familyproductFk")
	public List<FamilytraceabilityForm> listByCondition(FamilytraceabilityForm form) throws Exception {
		FamilytraceabilityExample c = new FamilytraceabilityExample();
		c.createCriteria().andFamilyproductFkEqualTo(form.getFamilyproductFk());
		c.setOrderByClause("id DESC");
		List<Familytraceability> traceList = familytraceabilityMapper.selectByExample(c);
		return this.totraceFormList(traceList);
	}

	@Override
	public List<FamilytraceabilityForm> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilytraceabilityForm> listPageByCondition(FamilytraceabilityForm cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilytraceabilityForm> listPageByConditon(FamilytraceabilityForm cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(FamilytraceabilityForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(FamilytraceabilityForm con) throws Exception {
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
	public int countByCondition(FamilytraceabilityForm con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(FamilytraceabilityForm record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private List<FamilytraceabilityForm> totraceFormList(List<Familytraceability> traceList)
			throws Exception {
		List<FamilytraceabilityForm> resultList=null;
		if(null!=traceList && traceList.size()>0){
			resultList=new ArrayList<FamilytraceabilityForm>();
			for(Familytraceability result:traceList){
				Familyproduct product = familyproductService.selectByPrimaryKey(result.getFamilyproductFk());
				FamilytraceabilityForm orig=new FamilytraceabilityForm();
				BeanUtils.copyProperties(orig, result);
				orig.setProductName(product.getNamecn());
				resultList.add(orig);
			}
		}
		return resultList;
	}

	@Override
	public boolean isExistPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
}
