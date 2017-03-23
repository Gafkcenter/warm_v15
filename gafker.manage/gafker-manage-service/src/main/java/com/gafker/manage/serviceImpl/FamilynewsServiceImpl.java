package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.mapper.FamilynewsMapper;
import com.gafker.manage.mapper.UserattributeMapper;
import com.gafker.manage.pojo.Familynews;
import com.gafker.manage.pojo.FamilynewsExample;
import com.gafker.manage.pojo.Userattribute;
import com.gafker.manage.pojo.form.FamilynewsForm;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.FamilynewsService;

@Service
@Transactional
public class FamilynewsServiceImpl implements FamilynewsService {

	@Autowired
	FamilynewsMapper familynewsMapper;

	@Autowired
	UserattributeMapper userattributeMapper;

	@Override
	@CacheEvict(value = "family_News", key = "'news'+#record.id")
	public int saveSelective(Familynews record) throws Exception {
		record.setStar(1l);
		record.setCreateTime(new Date());
		return familynewsMapper.insertSelective(record);
	}

	@Override
	@Caching(evict = { @CacheEvict(value = { "family_News" }, key = "'news'+#record.id") })
	public int updateSelective(Familynews record) throws Exception {
		return familynewsMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	@Caching(evict = { @CacheEvict(value = { "family_News" }, key = "'news'+#record.id") })
	public int updateByCondition(Familynews record, FamilynewsExample con) throws Exception {
		Familynews news = this.selectByPrimaryKey(record.getId());
		if (null != news) {
			Long star = news.getStar();
			star = null == star ? 1l : star + 1;
			news.setStar(star);
		}
		return familynewsMapper.updateByPrimaryKey(news);
	}

	@Override
	@CachePut(value = "family_News", key = "'news'+#id")
	public FamilynewsForm selectByPrimaryKey(Long id) throws Exception {
		Familynews news = familynewsMapper.selectByPrimaryKey(id);
		FamilynewsForm familyNews = new FamilynewsForm();
		BeanUtils.copyProperties(familyNews, news);
		return familyNews;
	}

	@Override
	public List<FamilynewsForm> listAll() throws Exception {
		return this.listByCondition(new FamilynewsExample());
	}

	@Override
	public boolean isExistPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int save(Familynews record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Familynews record, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveBatch(List<Familynews> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Familynews record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBatch(List<Familynews> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public FamilynewsForm selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FamilynewsForm findByCondition(FamilynewsExample c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilynewsForm> listByCondition(FamilynewsExample c) throws Exception {
		List<Familynews> newsList = familynewsMapper.selectByExample(c);
		return this.totraceFormList(newsList);
	}

	@Override
	public List<FamilynewsForm> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilynewsForm> listPageByCondition(FamilynewsExample cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FamilynewsForm> listPageByConditon(FamilynewsExample cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Familynews record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(FamilynewsExample con) throws Exception {
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
	public int countByCondition(FamilynewsExample con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(Familynews record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	private List<FamilynewsForm> totraceFormList(List<Familynews> traceList) throws Exception {
		List<FamilynewsForm> resultList = null;
		if (null != traceList && traceList.size() > 0) {
			resultList = new ArrayList<FamilynewsForm>();
			for (Familynews result : traceList) {
				Userattribute user = userattributeMapper.selectByPrimaryKey(result.getCreateBy());
				FamilynewsForm orig = new FamilynewsForm();
				BeanUtils.copyProperties(orig, result);
				if (null != user && !user.getUsername().equals(""))
					orig.setUserName(user.getUsername());
				resultList.add(orig);
			}
		}
		return resultList;
	}
}
