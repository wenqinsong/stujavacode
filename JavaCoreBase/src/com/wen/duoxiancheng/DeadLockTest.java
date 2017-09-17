package com.wen.duoxiancheng;

public class DeadLockTest {

	public static void main(String[] args) {
		char[] a = {'A','B','C'};
		char[] b = {'D','E','F'};
		DeadLockThread test1 =new DeadLockThread(a,b);
		DeadLockThread test2 =new DeadLockThread(b,a);
		test1.start();
		test2.start();
		

	}

}
class DeadLockThread extends Thread{
	private char[] source;
	private char[] dest;
	public DeadLockThread(char[] source, char[] dest) {
		super();
		this.source = source;
		this.dest = dest;
	}
	@Override
	public void run() {
		synchronized (source) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (dest) {
				System.arraycopy(source,0,dest,0,source.length);
				System.out.println(dest);
				
			}
			
		}
	}
	
	
}