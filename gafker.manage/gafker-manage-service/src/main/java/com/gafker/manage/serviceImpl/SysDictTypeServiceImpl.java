package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.mapper.SysDictTypeMapper;
import com.gafker.manage.pojo.SysDictType;
import com.gafker.manage.pojo.SysDictTypeExample;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.pojo.query.SysDictQuery;
import com.gafker.manage.service.SysDictTypeService;

@Transactional
@Service
public class SysDictTypeServiceImpl implements SysDictTypeService {
	public static Logger logger1 = LogManager.getLogger(SysDictTypeServiceImpl.class);

	@Autowired
	private SysDictTypeMapper sysDictTypeMapper;

	public static Map<String, String> dictTypeMapContainerIdKey = new ConcurrentHashMap<>();
	public static Map<String, String> dictTypeMapContainerNameKey = new ConcurrentHashMap<>();
	public static List<SysDictType> listAllDictType = new ArrayList<SysDictType>();

	@Override
	@Caching(evict = { @CacheEvict(value = { "dictTypeList" }, key = "'all_dictTypeList'") })
	public int save(SysDictType record) throws Exception {
		int insert = sysDictTypeMapper.insert(record);
		this.refreshDictTypeCache();
		return insert;
	}

	@Override
	public int saveSelective(SysDictType record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<SysDictType> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(SysDictType record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(SysDictType record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<SysDictType> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysDictType selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysDictType selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Cacheable(value = { "dictTypeList" }, key = "'all_dictTypeList'")
	public List<SysDictType> listAll() throws Exception {
		if (listAllDictType == null || listAllDictType.size() <= 0) {
			this.refreshDictTypeCache();
		}
		return listAllDictType;
	}

	private void refreshDictTypeCache() {
		listAllDictType = sysDictTypeMapper.selectByExample(null);
		for (SysDictType type : listAllDictType) {
			dictTypeMapContainerIdKey.put("" + type.getId(), type.getNamecn());
			dictTypeMapContainerNameKey.put(type.getNamecn(), "" + type.getId());
		}
	}

	@Override
	public List<SysDictType> listByCondition(SysDictQuery c) {
		SysDictTypeExample example = new SysDictTypeExample();
		example.createCriteria().andNamecnEqualTo(c.getType());
		List<SysDictType> typeList = sysDictTypeMapper.selectByExample(example);
		return typeList;
	}

	@Override
	public List<SysDictType> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(SysDictType record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
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
	public int countBySelfCondition(SysDictType record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDictId(String namecn) throws Exception {
		this.setDictTypeData();
		return dictTypeMapContainerNameKey.get(namecn);
	}

	@Override
	public String getDictName(String id) throws Exception {
		this.setDictTypeData();
		return dictTypeMapContainerIdKey.get(id);
	}

	@Override
	public int updateByCondition(SysDictType record, SysDictQuery con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysDictType findByCondition(SysDictQuery c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDictType> listPageByCondition(SysDictQuery cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDictType> listPageByConditon(SysDictQuery cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByCondition(SysDictQuery con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countByCondition(SysDictQuery con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDictTypeData() throws Exception {
			this.listAll();
	}

	@Override
	public int saveSelective(SysDictType record, HttpServletRequest request, HttpServletResponse response)
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
