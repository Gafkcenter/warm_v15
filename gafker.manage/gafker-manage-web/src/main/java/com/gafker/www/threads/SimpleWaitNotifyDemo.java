package com.gafker.www.threads;

public class SimpleWaitNotifyDemo {
final static Object object =new Object();
public static void main(String[] args) {
	Thread t1 = new T1();
	Thread t2 = new T2();
	t1.start();
	t2.start();
}
public static class T1 extends Thread{

	@Override
	public void run() {
		synchronized(object){
			System.out.println(System.currentTimeMillis()+":T1 start! ");
			try {
				System.out.println(System.currentTimeMillis()+":T1 wait for object! ");
				object.wait();//宣布T1进入等待
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(System.currentTimeMillis()+":T1 end! ");
		}
	}
}
public static class T2 extends Thread{
	
	@Override
	public void run() {
		synchronized(object){
			System.out.println(System.currentTimeMillis()+":T2 start! notify one thread");
			object.notify();//T2 随机唤醒一个线程，此处只有T1(唤醒T1)
			System.out.println(System.currentTimeMillis()+":T2 end! ");
			try {
				System.out.println("notify ...");
				Thread.sleep(2000);
				System.out.println("... notify");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
}
