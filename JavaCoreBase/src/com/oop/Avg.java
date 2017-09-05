package com.oop;

import java.util.Scanner;

public class Avg {
	public int sum() {
		int sum = 0;
		System.out.println("请输入三门课的第一门成绩");
		Scanner input = new Scanner(System.in);
		sum += input.nextInt();
		System.out.println("请输入三门课的第二门成绩");
		sum += input.nextInt();
		System.out.println("请输入三门课的第三门成绩");
		sum += input.nextInt();
		return sum;
	}
	public float avg() {
		return (float) sum()/3;
		
	}

}
