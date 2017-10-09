package com.wen.reflect;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			String threadName =Thread.currentThread().getName();
			System.out.println(threadName+":"+i);
		}

	}

}
