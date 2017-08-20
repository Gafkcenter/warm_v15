package com.gafker.manage.service.queue;

public class GafkerPhoneSevenGeoConsumer implements Runnable {
	private static GafkerPhoneSevenGeoConsumer consumer;
	public static volatile boolean isRunning = true;

	@Override
	public void run() {
		while (Thread.currentThread().isInterrupted() == false && isRunning) {
			try {
				System.out.println("出队 " + GafkerTaskQueue.getGafkerTaskQueue().take());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static GafkerPhoneSevenGeoConsumer getInstance() {
		if (consumer == null) {
			synchronized (GafkerPhoneSevenGeoConsumer.class) {
				if (consumer == null) {
					consumer = new GafkerPhoneSevenGeoConsumer();
				}
			}
		}
		return consumer;
	}
}
