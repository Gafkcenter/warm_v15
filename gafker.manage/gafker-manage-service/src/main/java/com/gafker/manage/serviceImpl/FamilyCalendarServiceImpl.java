package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gafker.manage.entity.Familycalendar;
import com.gafker.manage.entity.FamilycalendarExample;
import com.gafker.manage.entity.FamilycalendarQuery;
import com.gafker.manage.entity.Page;
import com.gafker.manage.mapper.FamilyCalendarMapper;
import com.gafker.manage.pojo.FamilycalendarForm;
import com.gafker.manage.service.FamilyCalendarService;

@Service
public class FamilyCalendarServiceImpl implements FamilyCalendarService {
	private static final Logger LOGGER = LogManager.getLogger(FamilyCalendarServiceImpl.class);
	@Autowired
	FamilyCalendarMapper familyCalendarMapper;

	@Override
	public int save(FamilycalendarForm s) throws Exception {
		int result = familyCalendarMapper.insertSelective(s);
		return result;
	}

	@Override
	public int save(List<FamilycalendarForm> s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(FamilycalendarForm s) throws Exception {
		int result = familyCalendarMapper.updateByPrimaryKeySelective(s);
		return result;
	}

	@Override
	public int updateSelect(FamilycalendarForm s) throws Exception {
		int result = familyCalendarMapper.updateByPrimaryKeySelective(s);
		return result;
	}

	@Override
	public int delete(Long id) throws Exception {
		int result = familyCalendarMapper.deleteByPrimaryKey(id);
		return result;
	}

	@Override
	public FamilycalendarForm findByPrimaryId(Long id) throws Exception {
		Familycalendar data = familyCalendarMapper.selectByPrimaryKey(id);
		FamilycalendarForm dataVo = this.copyEntityToVoForm(data);
		return dataVo;
	}

	@Override
	public List<FamilycalendarForm> selectByExample(FamilycalendarQuery c) throws Exception {
		return this.selectByExample(c, null);
	}

	@Override
	public List<FamilycalendarForm> selectByExample(FamilycalendarQuery c, Page<?> p)
			throws Exception {
		FamilycalendarExample example = new FamilycalendarExample();
		example.setOrderByClause("id DESC");
		if(p!=null&&p.getPageSize()!=0){
			example.setStart(p.getPageStart());
			example.setLimit(p.getPageSize());
		}
		List<Familycalendar> data = familyCalendarMapper.selectByExample(example);
		List<FamilycalendarForm> dataVo = this.copyEntityToVoForm(data);
		return dataVo;
	}

	@Override
	public List<FamilycalendarForm> selectAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "l", method = RequestMethod.GET)
	public List<FamilycalendarForm> selectAll(Page<?> p) throws Exception {
		FamilycalendarExample example=new FamilycalendarExample();
		if(p!=null && p.getPageSize()>0){
			example.setStart(p.getPageStart());
			example.setLimit(p.getPageSize());
		}
		example.setOrderByClause("id DESC");
		List<Familycalendar> dataVo = familyCalendarMapper.selectByExample(example);
		List<FamilycalendarForm> voForm = this.copyEntityToVoForm(dataVo);
		return voForm;
	}
	@Override
	public FamilycalendarForm copyEntityToVoForm(Familycalendar entity) throws Exception {
		FamilycalendarForm dest = null;
		if (entity != null) {
			dest = new FamilycalendarForm();
			BeanUtils.copyProperties(dest, entity);
		}
		return dest;
	}

	@Override
	public List<FamilycalendarForm> copyEntityToVoForm(List<Familycalendar> entity) throws Exception {
		List<FamilycalendarForm> desc = null;
		if (!CollectionUtils.isEmpty(entity)) {
			desc = new ArrayList<FamilycalendarForm>();
			for (Familycalendar en : entity)
				desc.add(this.copyEntityToVoForm(en));
		}
		return desc;
	}
}
