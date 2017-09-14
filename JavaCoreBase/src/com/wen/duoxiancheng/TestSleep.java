package com.wen.duoxiancheng;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class TestSleep {

	public static void main(String[] args) {
		MyDate thread = new MyDate();
		thread.start();

	}
	

}
class MyDate extends Thread{
	public void run() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss:SSSS");
		while (true) {
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}