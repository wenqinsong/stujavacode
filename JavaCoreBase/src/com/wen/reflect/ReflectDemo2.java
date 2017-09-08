package com.wen.reflect;

public class ReflectDemo2 {
	@SuppressWarnings("all")
	public static void main(String[] args) throws Exception {

		Class class1 = Student.class;

		Student student = new Student();
		Class class2 = student.getClass();

		Class class3 = Class.forName("com.wen.reflect.Student");
		
		
	}

}
