package com.shuzu;

import java.util.Arrays;



public class Array4 {

	public static void main(String[] args) {
		int[] array = new int[] {1,7,5,6,3,8,9};
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
