package com.shuzu;

public class Arrays3 {

	public static void main(String[] args) {
		
		String[] temp =new String[] {"李宁运动鞋","Adias背包","Kappa外套","安踏腰包","Nike背包"};
		
		int length = temp.length;
		System.out.println("特价商品:");
		for (int i=0;i<length;i++) {
			
			System.out.println(temp[i]);
		}

	}

}
