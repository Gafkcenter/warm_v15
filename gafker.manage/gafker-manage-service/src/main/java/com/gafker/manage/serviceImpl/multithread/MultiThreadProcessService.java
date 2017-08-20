package com.gafker.manage.serviceImpl.multithread;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.gafker.manage.service.PhonesevenService;

/*
 * 多线程工作内容 
 */
@Service
public class MultiThreadProcessService {
	
//	@Autowired
	PhonesevenService phonesevenService;
	
	public static final Logger logger = LogManager.getLogger(MultiThreadProcessService.class);

	/**
	 * 默认处理流程耗时1000ms
	 * @throws Exception 
	 */
	public void checkGeo() throws Exception {
		logger.debug("MultiThreadProcessService-processSomething" + Thread.currentThread() + "......start");
		try {
			System.out.println();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		logger.debug("MultiThreadProcessService-processSomething" + Thread.currentThread() + "......end");
	}
}