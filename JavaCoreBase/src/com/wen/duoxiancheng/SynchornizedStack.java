package com.wen.duoxiancheng;

public class SynchornizedStack {
	private int index=0;
	private char[] data =new char[6];
	
	public synchronized void push(char c) {
		while (index == data.length) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			this.notify();
			data[index] =c;
			index++;
			
		}
		
	}
	public synchronized char pop() {
		while (index ==0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		this.notify();
		index--;
		return data[index];
		
	}

}
class Producer implements Runnable{
	SynchornizedStack stack;

	public Producer(SynchornizedStack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			char c =(char)(Math.random()*26+'A');
			stack.push(c);
			System.out.println("生产:"+c);
			try {
				Thread.sleep((int)(Math.random()*300));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
class Consumer implements Runnable{
	SynchornizedStack stack;

	public Consumer(SynchornizedStack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			char c =stack.pop();
			System.out.println("消费："+c);
			try {
				Thread.sleep((int)(Math.random()*500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}