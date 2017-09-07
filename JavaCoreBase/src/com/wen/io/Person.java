package com.wen.io;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Person implements Serializable {


   
   private static final long  serialVersionUID = 1L;
   private String personId;
   private String name;
   private transient String pass;
   
   public Person() {
	
	   super();
   }
   
	public Person(String personId,String name,String pass) {
		super();
		this.personId=personId;
		this.pass=pass;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", pass=" + pass + "]";
	}
	
	
}
