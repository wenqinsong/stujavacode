package com.wen.cmdemoclass;

public class StringDemo {

	public static void main(String[] args) {
		//String类中的各种方法
		String demo = new String("ABCDEFG");
		String demo2 = new String("AHCDGF");
		System.out.println(demo);
		System.out.println(demo.charAt(0));
		
		System.out.println(demo.contains("G"));
		
		System.out.println(demo.compareTo(demo2));
		
		System.out.println(demo.contains(demo2));
	}

}
