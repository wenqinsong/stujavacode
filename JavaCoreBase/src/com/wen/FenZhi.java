package com.wen;

import java.util.Scanner;

public class FenZhi {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("请输入分数：");
		int score = input.nextInt();
		if (score == 100) {
			System.out.println("父亲给她买辆车");

		} else if (score >= 90) {
			System.out.println("母亲给她买台笔记本电脑");

		} else if (score >= 80) {
			System.out.println("母亲给她买手机");

		} else if (score >=30 && score < 60) {

			System.out.println("没礼物");
		} else if (score < 30) {

			System.out.println("you are die");
		
		}
	}

}


