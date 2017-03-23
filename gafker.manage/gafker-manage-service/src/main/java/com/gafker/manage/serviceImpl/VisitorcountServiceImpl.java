package com.gafker.manage.serviceImpl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gafker.manage.mapper.VisitorcountMapper;
import com.gafker.manage.pojo.Visitorcount;
import com.gafker.manage.pojo.VisitorcountExample;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.VisitorcountService;

@Service
public class VisitorcountServiceImpl implements VisitorcountService {

	@Autowired
	private VisitorcountMapper visitorcountMapper;
	
	@Override
	public Long getVisitorCount() throws Exception {
		Long countVisitor = 0l;
		List<Visitorcount> vList = visitorcountMapper.selectByExample(null);
		if (!vList.isEmpty()) {
			for (Visitorcount v : vList) {
				countVisitor += v.getVisitortimes();
			}
		}
		return countVisitor;
	}

	@Override
	public int save(Visitorcount record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveSelective(Visitorcount record) throws Exception {
		int insert = visitorcountMapper.insertSelective(record);
		return insert;
	}

	@Override
	public int saveBatch(List<Visitorcount> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Visitorcount record) throws Exception {
		int update = visitorcountMapper.updateByPrimaryKeySelective(record);
		return update;
	}

	@Override
	public int updateSelective(Visitorcount record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByCondition(Visitorcount record, VisitorcountExample con) throws Exception {
		int update = visitorcountMapper.updateByExampleSelective(record, con);
		return update;
	}

	@Override
	public int updateBatch(List<Visitorcount> record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Visitorcount selectByPrimaryKey(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitorcount selectByPrimaryKey(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorcount> listAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitorcount findByCondition(VisitorcountExample c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorcount> listByCondition(VisitorcountExample c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorcount> listByPage(Page page) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorcount> listPageByCondition(VisitorcountExample cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitorcount> listPageByConditon(VisitorcountExample cond) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Visitorcount record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Number id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByCondition(VisitorcountExample con) throws Exception {
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
	public int countByCondition(VisitorcountExample con) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int countBySelfCondition(Visitorcount record) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int saveOrUpdate(Visitorcount c) throws Exception {
		VisitorcountExample example = new VisitorcountExample();
		example.createCriteria().andUriEqualTo(c.getUri());
		// 访问次数
		List<Visitorcount> countList = visitorcountMapper.selectByExample(example);
		int result;
		if (countList.isEmpty()) {
			Visitorcount ti = new Visitorcount();
			ti.setIp(c.getIp());
			ti.setCreatetime(new Date());
			ti.setUpdatetime(new Date());
			ti.setVisitoruser(c.getVisitoruser());
			ti.setVisitortimes(1l);
			ti.setUri(c.getUri());
			result = this.saveSelective(ti);
		} else {
			Visitorcount visitor = countList.get(0);
			visitor.setUpdatetime(new Date());
			visitor.setVisitortimes(visitor.getVisitortimes()+1);
			result = this.updateByPrimaryKey(visitor);
		}
		return result;
	}

	@Override
	public int saveSelective(Visitorcount record, HttpServletRequest request, HttpServletResponse response)
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
