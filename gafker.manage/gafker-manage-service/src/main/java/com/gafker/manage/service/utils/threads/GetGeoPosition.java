package com.gafker.manage.service.utils.threads;

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

	public GetGeoPosition() {
	}

	public GetGeoPosition(PhonesevenService phonesevenService) {
		this.phonesevenService = phonesevenService;
	}

	@Override
	public void run() {
		try {
			phonesevenService.updateGeoPhoneSeven(null, new PhonesevenForm());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
