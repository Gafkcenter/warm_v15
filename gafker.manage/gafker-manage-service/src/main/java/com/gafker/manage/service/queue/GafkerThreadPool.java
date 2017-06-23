package com.gafker.manage.service.queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GafkerThreadPool {
private static ExecutorService threadPool=null;
public static ExecutorService getGafkerThreadPool(){
	if(threadPool==null){
		synchronized(GafkerThreadPool.class){
			if(threadPool == null){
				threadPool=Executors.newCachedThreadPool();
			}
		}
	}
	return threadPool;
}
}
