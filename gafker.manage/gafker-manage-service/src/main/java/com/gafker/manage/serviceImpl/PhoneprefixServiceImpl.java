package com.gafker.manage.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gafker.manage.mapper.PhoneprefixMapper;
import com.gafker.manage.pojo.Phoneprefix;
import com.gafker.manage.pojo.PhoneprefixExample;
import com.gafker.manage.pojo.PhoneprefixExample.Criteria;
import com.gafker.manage.pojo.enums.PhoneprefixStatus;
import com.gafker.manage.pojo.form.PhoneprefixForm;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.PhoneprefixService;

@Service
@Transactional
public class PhoneprefixServiceImpl implements PhoneprefixService {
	private static final Logger LOGGER = LogManager.getLogger(PhoneprefixServiceImpl.class);
	@Autowired
	PhoneprefixMapper phoneprefixMapper;

	@Override
	public int save(PhoneprefixForm s) throws Exception {
		int result = phoneprefixMapper.insertSelective(s);
		return result;
	}

	@Override
	public int update(PhoneprefixForm s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSelect(PhoneprefixForm s) throws Exception {
		int result = phoneprefixMapper.updateByPrimaryKeySelective(s);
		return result;
	}

	@Override
	public int delete(Long id) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PhoneprefixForm findByPrimaryId(Long id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneprefixForm> selectByExample(PhoneprefixExample c) throws Exception {
		Criteria cr = c.createCriteria();
		cr.andStatusEqualTo(PhoneprefixStatus.OPEN.getValue());
		cr.andFinishedIsNull();
		List<Phoneprefix> dataList = phoneprefixMapper.selectByExample(c);
		List<PhoneprefixForm> formList = this.copyToFormList(dataList);
		return formList;
	}

	@Override
	public List<PhoneprefixForm> selectByExample(PhoneprefixExample c, Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PhoneprefixForm> selectAll() throws Exception {
		List<Phoneprefix> dataList = phoneprefixMapper.selectByExample(null);
		List<PhoneprefixForm> formList = this.copyToFormList(dataList);
		return formList;
	}

	private List<PhoneprefixForm> copyToFormList(List<Phoneprefix> dataList) throws Exception {
		List<PhoneprefixForm> formList = null;
		if (dataList != null && dataList.size() > 0) {
			formList = new ArrayList<PhoneprefixForm>();
			for (Phoneprefix data : dataList) {
				PhoneprefixForm d = this.copyToFormList(data);
				formList.add(d);
			}
		}
		return formList;
	}

	private PhoneprefixForm copyToFormList(Phoneprefix data) throws Exception {
		PhoneprefixForm d = null;
		if (data != null) {
			d = new PhoneprefixForm();
			BeanUtils.copyProperties(d, data);
		}
		return d;
	}


	@Override
	public List<PhoneprefixForm> selectAll(Page p) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(List<PhoneprefixForm> s) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
