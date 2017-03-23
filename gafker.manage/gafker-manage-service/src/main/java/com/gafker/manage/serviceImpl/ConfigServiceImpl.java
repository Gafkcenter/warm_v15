package com.gafker.manage.serviceImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.service.ConfigService;

/**
 * com.cn.cust.common.listener.ConfigListener 从数据库加载系统配置
 * 
 * @author gafker
 *
 */
@Service
@Transactional
public class ConfigServiceImpl implements ConfigService {

	public static Logger logger1 = LogManager.getLogger(ConfigServiceImpl.class);

	private List<Object> conList;

	@Override
	public int save(Object record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Object record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<Object> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Object record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelective(Object record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(Object record, Object con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<Object> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findByCondition(Object c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listByCondition(Object c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listByPage(Object page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listPageByCondition(Object cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object> listPageByConditon(Object cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Object record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(Object con) throws Exception {
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
	public int countByCondition(Object con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(Object record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void initConfig() {
		List<Object> cList = conList;
		for (int i = 0; i < 1000; i++) {
			logger1.info("从数据库加载项目信息成功！");
		}
	}

	@Override
	public int saveSelective(Object record, HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isExistPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
