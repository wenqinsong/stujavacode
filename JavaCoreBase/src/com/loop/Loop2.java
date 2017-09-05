package com.loop;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		//for循环
		//for (int i = 1; i <= 100; i++) {
			//System.out.println("第"+i+"遍：好好学习天天向上");
		
		//}
		Scanner input = new Scanner(System.in);
		int sum = 0,avg;
		for(int i =1;i<=5;i++) {
			System.out.println("请输入第"+i+"门课程");
			sum+=input.nextInt();
		}
		avg = sum/5;
		System.out.println("课程平均分位："+avg);

	}

}
