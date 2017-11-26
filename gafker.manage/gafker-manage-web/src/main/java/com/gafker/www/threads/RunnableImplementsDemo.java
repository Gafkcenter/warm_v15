package com.gafker.www.threads;

public class RunnableImplementsDemo implements Runnable {
	public static void main(String[] args) {
		Thread t1 =new Thread(new RunnableImplementsDemo());
		t1.start();
	}

	public void run() {
		System.out.println("Oh, I am Runnable!");
	}

}
