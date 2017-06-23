package com.gafker.manage.service.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class GafkerTaskQueue {
	private static LinkedBlockingQueue<Object> queues = null;

	public static LinkedBlockingQueue<Object> getGafkerTaskQueue() {
		if (queues == null) {
			synchronized(LinkedBlockingQueue.class){
				if(queues == null){
					queues = new LinkedBlockingQueue<Object>();
					System.out.println("初始化 队列!");
				}
			}
		}
		return queues;
	}
	public static void add(Object obj){
		if(queues==null){
			queues=getGafkerTaskQueue();
		}
		queues.offer(obj);
		System.out.println("--------------------");
		System.out.println("入队："+obj);
	}
}
