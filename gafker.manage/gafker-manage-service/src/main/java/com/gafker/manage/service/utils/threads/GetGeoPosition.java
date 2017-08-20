package com.gafker.manage.service.utils.threads;

import java.util.List;

import com.gafker.manage.pojo.PhonesevenForm;
import com.gafker.manage.service.PhonesevenService;

/**
 * 多线程服务中心
 * 
 * @author gafker
 *
 */
public class GetGeoPosition implements Runnable {
	private PhonesevenService phonesevenService;
	private List<PhonesevenForm> pList;

	public GetGeoPosition() {
	}

	public GetGeoPosition(PhonesevenService phonesevenService,List<PhonesevenForm> pList) {
		this.phonesevenService = phonesevenService;
		this.pList=pList;
	}

	@Override
	public void run() {
		try {
			System.out.println(pList.size());
			phonesevenService.updateGeoPhoneSeven(100l, pList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
