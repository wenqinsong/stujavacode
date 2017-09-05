package com.wen;

public class Birthday {
	private int day;
	private int month;
	private int year;

	public void display(int day, int month, int year) {
		day = 11;
		month = 11;
		year = 2015;
		System.out.println("传递方法：" + year + "-" + month + "-" + day);
		
	}

	public void display(Birthday birthday) {
		birthday.year = 2012;
		birthday.month = 12;
		birthday.day = 12;
		System.out.println("传递方法：" + birthday.year + "-" + birthday.month + "-" + birthday.day);
	}
	public static void testValue1() {
		Birthday birthday =new Birthday();
		int day =12,month = 12,year = 2016;
		System.out.println("传递方法："+year+"-"+month+"-"+day);
		birthday.display(year,month,day);
		System.out.println("传递方法："+year+"-"+month+"-"+day);
	}
	public static void testValue2() {
		Birthday birthday = new Birthday();
		birthday.day = 3;
		birthday.month = 3;
		birthday.year = 2016;
		System.out.println("传递方法：" + birthday.year + "-" + birthday.month + "-" + birthday.day);
		birthday.display(birthday);
		System.out.println("传递方法：" + birthday.year + "-" + birthday.month + "-" + birthday.day);
	}

	public static void main(String[] args) {
		testValue1();
		testValue2();

		// TODO Auto-generated method stub

	}

}
