package com.gafker.manage.service.queue;

public class GafkerPhoneSevenGeoProduce implements Runnable {
	private static volatile int i = 0;
	private static volatile boolean isRunning = true;

	@Override
	public void run() {
		while (isRunning) {
			GafkerTaskQueue.add(Integer.valueOf(i + ""));
			synchronized (GafkerPhoneSevenGeoProduce.class) {
				GafkerPhoneSevenGeoProduce.i++;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
