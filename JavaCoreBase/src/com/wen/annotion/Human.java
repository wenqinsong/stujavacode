package com.wen.annotion;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Human {
	private String name;
	@Deprecated
	private Integer age;
	
	@Deprecated
	public String say() {
		return "Human say() ...";
	}
}
