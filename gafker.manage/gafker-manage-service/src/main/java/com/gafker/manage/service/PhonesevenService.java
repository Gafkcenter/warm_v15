package com.gafker.manage.service;

import java.util.List;

import com.gafker.manage.pojo.FamilysizeExample;
import com.gafker.manage.pojo.form.PhonesevenForm;
import com.gafker.manage.pojo.page.Page;
import com.gafker.manage.service.base.BaseService2;

public interface PhonesevenService extends BaseService2<PhonesevenForm, FamilysizeExample, Page> {
	/**
	 * 完善7位电话号
	 */
	public int generateAndCheckPhoneSeven() throws Exception;

	/**
	 * 批量检测归属地更新
	 * 
	 * @param seven
	 * @param phoneList
	 */
	public void updateAttributionPhoneSeven(Long seven, List<PhonesevenForm> phoneList) throws Exception;

	/**
	 * 单个检测归属地更新
	 * 
	 * @param seven
	 * @param phoneList
	 * @return 
	 */
	public int updateAttributionPhoneSeven(Long seven, PhonesevenForm phoneList) throws Exception;
	public int saveVcfPhoneSeven(String cityAlpha, List<PhonesevenForm> phoneList) throws Exception;
}
