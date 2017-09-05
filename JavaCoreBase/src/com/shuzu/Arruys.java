package com.shuzu;

import java.util.Scanner;

public class Arruys {

	public static void main(String[] args) {
		int[] score = new int[5];
		int sum = 0;
		double avg;
		Scanner intput = new Scanner(System.in);
		System.out.println("请输入5位同学的成绩");
		int length = Array(score);
		for (int i = 0; i < length; i++) {

			score[i] = intput.nextInt();
			sum+=score[i];
		}
		avg=(double)sum/10;
		System.out.println(avg);

	}

	public static int Array(int[] score) {
		return score.length;
	}

}
