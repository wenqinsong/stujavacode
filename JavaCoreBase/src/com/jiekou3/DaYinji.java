package com.jiekou3;

import java.util.Scanner;


public class DaYinji implements InkBox,Paper{
	
	public static Scanner sc;
	String pper;

	@Override
	public void paper() {
		
		sc = new Scanner(System.in);
		pper = sc.nextLine();
		
		
		
	}

	@Override
	public void color() {
		
		
		if (pper.equals("A4")) {
			
			System.out.println("A4纸张仅支黑白打印！");
			
		}else if(pper.equals("A5")){
			
			System.out.println("A5纸张可以支持黑白和彩色两种打印方式");
			
		}
		
	}
	
	


	

}
