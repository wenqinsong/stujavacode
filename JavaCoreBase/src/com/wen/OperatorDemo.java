package com.wen;

public class OperatorDemo {

	public static void main(String[] args) {
		int a = 30;
		int b = 5;
		//算术运算
		System.out.println("a + b="+(a+b));
		System.out.println("a - b="+(a-b));
		System.out.println("a * b="+(a*b));
		System.out.println("a / b="+(a/b));
		System.out.println("a % b="+(a%b));  //取余运算
		
		//关系运算
		
		System.out.println("a > b="+(a>b));
		System.out.println("a < b="+(a<b));
		System.out.println("a = b="+(a==b));
		System.out.println("a >= b="+(a>=b));
		System.out.println("a <= b="+(a<=b));
		System.out.println("a != b="+(a!=b));
		
		//逻辑运算
		
		boolean b1 = true,b2 =false;
		System.out.println("b1 && b2："+(b1 && b2));
		System.out.println("b1 == b2："+(b1 == b2));
		System.out.println("b1 || b2："+(b1 || b2));
		System.out.println("b1 && b2："+(b1 && b2));
		System.out.println("!b2："+(!b2));
		
		
		boolean b3 = true;
		System.out.println("b1 && b3："+(b1 && b3));
		System.out.println("b1 && b3："+(b1 || b3));
		System.out.println("b3==："+b3);
		
	}

}
