package com.gafker.manage.service.queue;

import java.util.concurrent.ExecutorService;

public class QueueTaskRunDemo {
public static void main(String[] args) throws Exception {
	ExecutorService pools = GafkerThreadPool.getGafkerThreadPool();
	GafkerPhoneSevenGeoProduce produce =new GafkerPhoneSevenGeoProduce();
	pools.execute(produce);
	GafkerPhoneSevenGeoConsumer consumer =GafkerPhoneSevenGeoConsumer.getInstance();
	pools.execute(consumer);
}
}
