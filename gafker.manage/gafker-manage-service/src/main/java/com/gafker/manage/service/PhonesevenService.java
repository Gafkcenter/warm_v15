package com.gafker.manage.service;

import java.util.List;

import com.gafker.manage.entity.Page;
import com.gafker.manage.entity.Phoneseven;
import com.gafker.manage.entity.PhonesevenExample;
import com.gafker.manage.pojo.PhonesevenForm;
import com.gafker.manage.service.base.BaseService2;

public interface PhonesevenService extends BaseService2<PhonesevenForm,Phoneseven, PhonesevenExample, Page> {
	
	public  <F> List<F> selectByExampleForm(PhonesevenExample c) throws Exception;
	
	
	/**
	 * 完善7位电话号
	 */
	public int generateAndCheckPhoneSeven() throws Exception;

	/**
	 * 检测归属地更新
	 * 
	 * @param seven
	 * @param phoneList
	 */
	public void updateGeoPhoneSeven(Long seven, List<PhonesevenForm> phoneList) throws Exception;

	/**
	 * 批量检测归属地更新
	 * 
	 * @param seven
	 * @param phoneList
	 * @return 
	 */
	public int updateGeoPhoneSeven(Long seven, PhonesevenForm phoneList) throws Exception;
	public int saveVcfPhoneSeven(String cityAlpha, List<PhonesevenForm> phoneList) throws Exception;
	public PhonesevenExample getGeoCondition();
}
