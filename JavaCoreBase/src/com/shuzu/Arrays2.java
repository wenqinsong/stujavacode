package com.shuzu;



public class Arrays2 {

	public static void main(String[] args) {

		int[] series = new int[] { 8, 4, 2, 1, 23, 344, 12, 255 };
		int length = series.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {

			System.out.println(series[i]);
		}
		for (int i = 0; i < length; i++) {

			sum += series[i];
		}
		System.out.println("数列的和：" + sum);

	}

}
