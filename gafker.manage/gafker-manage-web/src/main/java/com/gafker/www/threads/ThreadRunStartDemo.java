package com.gafker.www.threads;
/**
 * t1.start():会新建一个线程，并运行run()方法。
 * t1.run():只会运行run()方法,不新建一个线程--只能用t1.start()开启线程。
 * @author gafker
 *
 */
public class ThreadRunStartDemo extends Thread{
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			@Override
		public void run() {
				String n2 = Thread.currentThread().getName();
			System.out.println("Hello , I am " +n2+" !");
			}
		};
		t1.run();
		//t1.start();
	}
}
