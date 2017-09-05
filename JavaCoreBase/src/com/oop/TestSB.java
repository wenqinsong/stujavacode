package com.oop;

import java.util.Scanner;

public class TestSB {

	public static void main(String[] args) {
		StudentBiz sb =new StudentBiz();
		Scanner input =new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("请输入第"+(i+1)+"个姓名：");
			String name =input.nextLine();
			sb.addName(i, name);
		}
		sb.showNames();
		
	}

}
