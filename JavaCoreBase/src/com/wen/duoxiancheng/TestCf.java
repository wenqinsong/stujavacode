package com.wen.duoxiancheng;




import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Method;





public class TestCf {

	public static void main(String[] args)  throws Exception{
		Myrunnable run = new Myrunnable();
		Thread thread = new Thread(run);
		thread.start();
		Runner runner = new Runner();
		Thread thread2 = new Thread(runner);
		thread2.start();
		
	}
}
class Myrunnable implements Runnable {

	public void run() {
		
		//在run方法中编写invoke()唤醒方法
		Class<ChengFa> class1 = ChengFa.class;

		try {
			ChengFa chengFa = class1.newInstance();
			Method method = class1.getDeclaredMethod("display");
			method.invoke(chengFa);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
class Runner implements Runnable{
	public void run() {
		try {
			PrintStream ps = new PrintStream("/home/cent/Downloads/abc.txt");
			System.setOut(ps);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}