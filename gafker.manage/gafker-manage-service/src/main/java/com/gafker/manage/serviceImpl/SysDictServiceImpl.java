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
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.SysDict;
import com.gafker.manage.entity.SysDictExample;
import com.gafker.manage.mapper.SysDictMapper;
import com.gafker.manage.pojo.SysDictQuery;
import com.gafker.manage.service.SysDictService;

@Transactional
@Service
public class SysDictServiceImpl implements SysDictService {
	public static Logger logger1 = LogManager.getLogger(SysDictServiceImpl.class);

	@Autowired
	private SysDictMapper sysDictMapper;

	public static Map<String, List<SysDict>> dictMapContainer = new ConcurrentHashMap<>();
	public static List<SysDict> listAllDict = new ArrayList<SysDict>();

	@Override
	@CacheEvict(value="dictList",key="'all_dictList'")
	public int save(SysDict record) throws Exception {
		int insert = sysDictMapper.insert(record);
		if (insert > 0) {
			dictMapContainer = new ConcurrentHashMap<>();
			listAllDict = new ArrayList<SysDict>();
			this.refreshDictCache();
		}
		return insert;
	}

	@Override
	public int saveSelective(SysDict record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<SysDict> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(SysDict record) throws Exception {
		int update = sysDictMapper.updateByPrimaryKey(record);
		return update;
	}

	@Override
	public int updateSelective(SysDict record) throws Exception {
		int updateSel = sysDictMapper.updateByPrimaryKeySelective(record);
		return updateSel;
	}

	@Override
	public int updateByCondition(SysDict record, SysDictQuery con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<SysDict> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SysDict selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SysDict selectByPrimaryKey(Integer id) throws Exception {
		SysDict sysDict = sysDictMapper.selectByPrimaryKey(id);
		return sysDict;
	}

	@Override
	@Cacheable(value="dictList",key="'all_dictList'")
	public List<SysDict> listAll() throws Exception {
		SysDictExample example = new SysDictExample();
		example.setOrderByClause("id DESC");
		List<SysDict> dictList = sysDictMapper.selectByExample(example);
		return dictList;
	}

	@Override
	public List<SysDict> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDict> listPageByCondition(SysDictQuery cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SysDict> listPageByConditon(SysDictQuery cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(SysDict record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(SysDictQuery con) throws Exception {
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
	public int countByCondition(SysDictQuery con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(SysDict record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<SysDict> listByCondition(SysDictQuery c) throws Exception {
		int size = c.getType().trim().length();
		SysDictExample example = new SysDictExample();
		example.setOrderByClause("id DESC");
		List<SysDict> dictlist = listAllDict;
		if (listAllDict.isEmpty()) {
			dictlist = sysDictMapper.selectByExample(example);
			this.refreshDictCache();
		}
		if (size > 0) {
			dictlist = dictMapContainer.get(c.getType());
		}
		return dictlist;
	}

	public String getDictName(String type, String value) {
		List<SysDict> list = dictMapContainer.get(type);
		for (SysDict l : list) {
			if (l.getValue().equals(value)) {
				value = l.getLabelCn();
				break;
			}
		}
		return value;
	}

	@Override
	public SysDict findByCondition(SysDictQuery c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 刷新字典缓存
	 * 
	 * @throws Exception
	 */
	private void refreshDictCache() throws Exception {
		if (listAllDict == null || listAllDict.size() <= 0) {
			// 缓存字典列表
			listAllDict = this.listAll();
			// 缓存字典类型Map
			this.listToMap(listAllDict, dictMapContainer);
		}
	}

	private void listToMap(List<SysDict> listAllDict, Map<String, List<SysDict>> dictMapContainer) {
		if (listAllDict != null || dictMapContainer.size() == 0) {
			for (SysDict dict : listAllDict) {
				if (dict.getType() != null && dictMapContainer.containsKey(dict.getType())) {
					dictMapContainer.get(dict.getType()).add(dict);
				} else if (dict.getType() != null) {
					ArrayList<SysDict> arrayList = new ArrayList<SysDict>();
					arrayList.add(dict);
					dictMapContainer.put(dict.getType(), arrayList);
				}
			}
		}
		logger1.info(
				"-------------字典容量：" + dictMapContainer.size() + "------------------------------------------------");

	}

	@Override
	public int saveSelective(SysDict record, HttpServletRequest request, HttpServletResponse response)
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
