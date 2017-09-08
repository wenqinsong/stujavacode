package com.wen.reflect;

import java.lang.reflect.Modifier;

public class ReflectDemo {
@SuppressWarnings("all")
	public static void main(String[] args) throws Exception {
		
		Class class1 = Student.class;
		
		Student student = new Student();
		
		Class class2 = student.getClass();
		
		Class class3 = Class.forName("com.wen.reflect.Student");
		
		System.out.println(class1.getName());
		System.out.println(class1.getModifiers());
		System.out.println(Modifier.toString(class1.getModifiers()));
		System.out.println(class1.getSuperclass());
	}

}
