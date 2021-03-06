package com.wen.duoxiancheng;

public class SynchornizedStack {
	private int index = 0;
	private char[] data = new char[26];

	public synchronized void push(char c) {
		while (index == data.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {

			}

		}
		this.notify();
		data[index] = c;
		index++;

	}

	public synchronized char pop() {
		while (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {

				
			}

		}
		this.notify();
		index--;
		return data[index];

	}

}

class Producer implements Runnable {
	SynchornizedStack stack;

	public Producer(SynchornizedStack s) {
		
		stack = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 27; i++) {
			char c = (char) (Math.random() * 26 + 'A');
			stack.push(c);
			System.out.println("生产:" + c);
			try {
				Thread.sleep((int) (Math.random() * 300));
			} catch (InterruptedException e) {

			}

		}

	}

}

class Consumer implements Runnable {
	SynchornizedStack stack;

	public Consumer(SynchornizedStack s) {

		stack = s;
	}

	@Override
	public void run() {
		for (int i = 0; i < 27; i++) {
			char c = stack.pop();
			System.out.println("消费：" + c);
			try {
				Thread.sleep((int) (Math.random() * 500));
			} catch (InterruptedException e) {}
		}

	}

}