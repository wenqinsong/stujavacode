package com.wen;

import java.util.Scanner;

public class FenZhi2 {
	private static Scanner a;

	public static void main(String[] args) {
		a = new Scanner(System.in);
		System.out.println("请输入分数：");
		int score = a.nextInt();
		switch(score) {
		case 90:
			System.out.println("非常好");
			break;
		case 80:
			System.out.println("优秀");
			break;
		case 70:
			System.out.println("良好");
			break;
		case 60:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
			break;
		}
		
	}

}
