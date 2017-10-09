package com.shuzu;

import java.util.Arrays;



public class Array4 {

	public static void main(String[] args) {
		int[] array = new int[] {11,15,13,19,17,23,21};
		Arrays.sort(array);
		
		int zj;
		System.out.print("排序后的数组:");
		for (int i = 0; i < array.length; i++) {
			System.out.println("\n"+array[i]);
		}
		zj = array[(array.length-1)/2];
		System.out.println("中间数是："+zj);
		

	}

}
