package com.wen.duoxiancheng;

public class SynchornizedTest {

	public static void main(String[] args) {
		SynchornizedStack stack =new SynchornizedStack();
		Runnable runnable =new Producer(stack);
		Runnable runnable2 =new Consumer(stack);
		Thread thread =new Thread(runnable);
		Thread thread2 =new Thread(runnable2);
		thread.start();
		thread2.start();

	}

}
