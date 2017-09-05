package com.oop;



public class StudentBiz {
	
	
		String[] names = new String[30];
		
	
	public void addName(int index,String name){
		names[index] = name;
		
	}
	public void showNames() {
		System.out.println("数组的内容是：");
		for (String string : names) {
			if(string !=null) {
			System.out.println(string);
			
		}
	}
	}
}
