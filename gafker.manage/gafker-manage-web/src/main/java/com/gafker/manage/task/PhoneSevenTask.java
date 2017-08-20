package com.gafker.manage.task;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import com.gafker.manage.entity.PhonesevenExample;
import com.gafker.manage.pojo.PhonesevenForm;
import com.gafker.manage.service.PhonesevenService;
import com.gafker.manage.service.utils.threads.GetGeoPosition;

@Component
public class PhoneSevenTask {
	@Autowired
	private PhonesevenService phonesevenService;
	
	public static  LinkedBlockingQueue<List<PhonesevenForm>> levelUpTaskList = new LinkedBlockingQueue<>();
	//@Scheduled(cron = "0 0/10 * * * ?")  
	public void phoneSevenGeo() throws Exception{
		
		if(levelUpTaskList.isEmpty()){
			int pageSize=100;
			int pageNo=1;
			for(int i=0;i<50;i++){
				PhonesevenExample c = phonesevenService.getGeoCondition();
				c.createCriteria().andFinishedIsNull();
				c.setStart((pageNo-1)*pageSize);
				c.setLimit(pageSize);
				List<PhonesevenForm> dataList = phonesevenService.selectByExample(c);
				levelUpTaskList.add(dataList);
				pageNo++;
			}
		}
		
	}
}
