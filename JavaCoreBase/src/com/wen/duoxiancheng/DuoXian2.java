package com.wen.duoxiancheng;

public class DuoXian2 {

	public static void main(String[] args) {
		
		MyRunnable run = new MyRunnable();
		Thread thread1 = new Thread(run);
		thread1.setName("thread1");
		thread1.start();
		Thread thread2 =new Thread(run);
		thread2.setName("thread1");
		thread2.start();
		for (int i = 0; i < 300; i++) {
			String threadName =Thread.currentThread().getName();
			System.out.println(threadName+":"+i);
		}

	}

}
