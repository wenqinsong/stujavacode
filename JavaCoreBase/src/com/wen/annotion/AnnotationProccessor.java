package com.wen.annotion;

import java.lang.reflect.Field;

public class AnnotationProccessor {

	public static void main(String[] args) throws Exception {
		
		Class<Student> class1 = Student.class;
		Student student= new Student();
		
		System.out.println("注解处理前："+student);
		
		Field[] fields = class1.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
			if (field.isAnnotationPresent(HelloWorld.class)) {
				HelloWorld helloWorld = field.getAnnotation(HelloWorld.class);
				System.out.println("HelloWorld 注解值是："+helloWorld);
				field.setAccessible(true);
				String iniValue = (String) field.get(student);
				if (null == iniValue || "".equals(iniValue)) {
					field.set(student, helloWorld.value());
				}
				
				
			}
		}
		System.out.println("注解处理后： "+student);

	}

}
