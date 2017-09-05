package com.wen.exception2;

import java.util.Scanner;



public class ClassNO {
	
	public void kecheng() {
		
		Scanner input = new Scanner(System.in);
		int classno = input.nextInt();
		
		
			switch (classno) {
			case 1:
				System.out.println("C#的课程！");
				break;
			case 2:
				System.out.println("Java的课程！");
				break;
			case 3:
				System.out.println("SQL的课程!");

			}
			
			
			
		
		
		
	}
	
	

}
