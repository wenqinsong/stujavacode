package com.wen.exception;

import java.util.Scanner;



@SuppressWarnings("all")

public class Exceotion {
	
	
	
	public int setAge() throws Exception{
		
		Scanner intput = new Scanner(System.in);
		System.out.println("请输入年龄：");
		 int age = intput.nextInt();
		if(!(age >=0 && age <= 100)) {
			
			
			throw new Exception("输入的值非法，请重新输入！");
		
			
		
		}
		return age;
	}
		
}	
		
	
		
		
		
	
		
		
	
   

