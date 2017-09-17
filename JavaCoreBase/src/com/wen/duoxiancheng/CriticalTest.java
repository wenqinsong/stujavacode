package com.wen.duoxiancheng;

public class CriticalTest {

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		CriticalStack stack =new CriticalStack();
		stack.push('a');
		stack.push('b');
		PushRunner runner1=new PushRunner(stack);
		PopRunner runner2 =new PopRunner(stack);
		Thread thread1 =new Thread(runner1);
		Thread thread2 =new Thread(runner2);
		thread1.start();
		thread2.start();
		System.out.println("Stack.index="+stack.index);

	}

}
class PushRunner implements Runnable {
	private CriticalStack stack;

	public PushRunner(CriticalStack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {
		stack.push('c');
		
	}

	
		
	
}

class PopRunner implements Runnable{
	private CriticalStack stack;

	public PopRunner(CriticalStack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {
		stack.pop();
		
	}
	
}

