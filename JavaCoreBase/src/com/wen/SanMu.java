package com.wen;

public class SanMu {

	public static void main(String[] args) {
		// 三目运算符
		int i = 9, j = 5;
		int k = i > j ? i : j;
		System.out.println("i =" + i);
		System.out.println("j =" + j);
		System.out.println("k =" + k);

		// 字符串运算

		String str1 = "anhui";
		String str2 = "hefei";
		int code = 35;
		String result = str1 + str2 + code + "号";
		System.out.println("result:" + result);

		// 类型转换操作符

		int a = 15;
		byte b = (byte) a;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		byte c = 10;
		a = c;
		System.out.println("c =" + c);
	

	}

}
