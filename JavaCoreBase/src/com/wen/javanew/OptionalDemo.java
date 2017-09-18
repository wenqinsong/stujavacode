package com.wen.javanew;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		OptionalDemo optionalDemo = new OptionalDemo();
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		Optional<Integer> a = Optional.ofNullable(value1);
		
		Optional<Integer> b = Optional.of(value2);
		System.out.println(optionalDemo.sum(a, b));
		
		Integer mInteger=3;
		Integer nInteger =5;
		System.out.println(optionalDemo.add(mInteger, nInteger));

	}
	public Integer sum(Optional<Integer> a,Optional<Integer> b) {
		
		System.out.println("第一个参数存在："+a.isPresent());
		System.out.println("第二个参数存在："+b.isPresent());
		
		Integer value1 = a.orElse(new Integer(0));
		
		Integer value2 =b.get();
		return value1+value2;
		
	}
	public Integer add(Integer a,Integer b) {
		return a+b;
		
	}

}
