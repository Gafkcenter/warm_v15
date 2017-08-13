package com.gafker.manage.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import com.gafker.manage.service.PhonesevenService;
import com.gafker.manage.service.utils.threads.GetGeoPosition;

@Component
public class PhoneSevenTask {
	@Autowired
	private ThreadPoolTaskExecutor taskExecutor;
	@Autowired
	private PhonesevenService phonesevenService;
	@Scheduled(cron = "0 0/5 * * * ?")  
	public void phoneSevenGeo(){
			taskExecutor.execute(new GetGeoPosition(phonesevenService));
	}
}
