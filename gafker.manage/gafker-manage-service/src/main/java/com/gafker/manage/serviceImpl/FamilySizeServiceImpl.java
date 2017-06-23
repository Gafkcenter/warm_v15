package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gafker.manage.entity.Familycalendar;
import com.gafker.manage.entity.Familysize;
import com.gafker.manage.entity.FamilysizeExample;
import com.gafker.manage.entity.Page;
import com.gafker.manage.mapper.FamilysizeMapper;
import com.gafker.manage.mapper.SysJacketSizeMapper;
import com.gafker.manage.mapper.SysShoesSizeMapper;
import com.gafker.manage.pojo.FamilycalendarForm;
import com.gafker.manage.pojo.FamilysizeForm;
import com.gafker.manage.service.FamilySizeService;

@Service
public class FamilySizeServiceImpl implements FamilySizeService {

	private static final Logger LOGGER = LogManager.getLogger(FamilySizeServiceImpl.class);
	@Autowired
	SysShoesSizeMapper sysShoesSizeMapper;
	@Autowired
	SysJacketSizeMapper SysJacketSizeMapper;
	@Autowired
	FamilysizeMapper familySizeMapper;

	@Override
	public int save(FamilysizeForm s) throws Exception {
		s.setCreatetime(new Date());
		s.setUpdatetime(new Date());
		int save = familySizeMapper.insert(s);
		return save;
	}

	@Override
	public int update(FamilysizeForm s) throws Exception {
		s.setUpdatetime(new Date());
		int save = familySizeMapper.updateByPrimaryKey(s);
		return save;
	}

	@Override
	public int updateSelect(FamilysizeForm s) throws Exception {
		s.setUpdatetime(new Date());
		int save = familySizeMapper.updateByPrimaryKeySelective(s);
		return save;
	}

	@Override
	public int delete(Long id) throws Exception {
		int save = familySizeMapper.deleteByPrimaryKey(id);
		return save;
	}

	@Override
	public FamilysizeForm findByPrimaryId(Long id) throws Exception {
		FamilysizeForm dataForm = null;
		Familysize data = familySizeMapper.selectByPrimaryKey(id);
		dataForm = this.copyFamilySizetoForm(data);
		return dataForm;
	}

	@Override
	public List<FamilysizeForm> selectByExample(FamilysizeExample c) throws Exception {
		List<FamilysizeForm> dataFormList = null;
		c.setOrderByClause("id DESC");
		List<Familysize> dataList = familySizeMapper.selectByExample(c);
		if (dataList != null && dataList.size() > 0)
			dataFormList = this.copyFamilySizetoForm(dataList);
		return dataFormList;
	}

	@Override
	public List<FamilysizeForm> selectByExample(FamilysizeExample c, Page p) throws Exception {
		List<FamilysizeForm> dataFormList = null;
		c.setOrderByClause("id DESC");
		List<Familysize> dataList = familySizeMapper.selectByExample(c);
		dataFormList = this.copyFamilySizetoForm(dataList);
		return dataFormList;
	}

	@Override
	public List<FamilysizeForm> selectAll() throws Exception {
		List<FamilysizeForm> dataFormList = null;
		FamilysizeExample c = new FamilysizeExample();
		c.setOrderByClause("id DESC");
		List<Familysize> dataList = familySizeMapper.selectByExample(null);
		dataFormList = this.copyFamilySizetoForm(dataList);
		return dataFormList;
	}

	@Override
	public List<FamilysizeForm> selectAll(Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<FamilysizeForm> copyFamilySizetoForm(List<Familysize> dataList) throws Exception {
		List<FamilysizeForm> dataFormList = new ArrayList<FamilysizeForm>();
		if (dataList != null && dataList.size() > 0) {
			dataFormList = new ArrayList<FamilysizeForm>();
			for (Familysize data : dataList) {
				FamilysizeForm dataForm = this.copyFamilySizetoForm(data);
				dataFormList.add(dataForm);
			}
		}
		return dataFormList;
	}

	public FamilysizeForm copyFamilySizetoForm(Familysize data) throws Exception {
		FamilysizeForm dataDesc = null;
		if (data != null) {
			dataDesc = new FamilysizeForm();
			BeanUtils.copyProperties(dataDesc, data);
		}
		return dataDesc;
	}

	@Override
	public int save(List<FamilysizeForm> s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FamilysizeForm copyEntityToVoForm(Familysize entity) throws Exception {
		FamilysizeForm dest = null;
		if (entity != null) {
			dest = new FamilysizeForm();
			BeanUtils.copyProperties(dest, entity);
		}
		return dest;
	}

	@Override
	public List<FamilysizeForm> copyEntityToVoForm(List<Familysize> entity) throws Exception {
		List<FamilysizeForm> desc = null;
		if (CollectionUtils.isEmpty(entity)) {
			desc = new ArrayList<FamilysizeForm>();
			for (Familysize en : entity)
				desc.add(this.copyEntityToVoForm(en));
		}
		return desc;
	}
}
