package com.wen.duoxiancheng;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ChengFa {

	public void display() throws FileNotFoundException {
		
		PrintStream ps = new PrintStream("/home/cent/Downloads/abc.txt");
		System.setOut(ps);
		
		for(int i=1;i<=9;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
				
			}
			System.out.println();
			
		}
		
			

	}

}
