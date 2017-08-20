package com.gafker.manage.service.utils.threads;

import com.gafker.manage.serviceImpl.multithread.MultiThreadProcessService;

/**
 * 多线程服务中心
 * @author gafker
 *
 */
public class MultiThreadDemo implements Runnable {
	private MultiThreadProcessService multiThreadProcessService;

	public MultiThreadDemo() {
	}

	public MultiThreadDemo(MultiThreadProcessService multiThreadProcessService) {
		this.multiThreadProcessService = multiThreadProcessService;
	}

	@Override
	public void run() {
		try {
			multiThreadProcessService.checkGeo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
