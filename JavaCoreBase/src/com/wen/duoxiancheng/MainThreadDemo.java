package com.wen.duoxiancheng;

public class MainThreadDemo {

	public static void main(String[] args) throws Exception {
		Thread main =Thread.currentThread();
		System.out.println(main.getName());
		System.out.println(main.getId());
		Thread.sleep(3000);
		System.out.println(main.getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(main.isAlive());
		System.out.println(main.isDaemon());
		System.out.println(main.isInterrupted());

	}

}
