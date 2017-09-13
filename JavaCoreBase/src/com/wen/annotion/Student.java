package com.wen.annotion;



import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Human {
	

	private int score=60;
	
	@HelloWorld("学生")
	private String desc;
	
	@HelloWorld
	private String info = "AAA";

	@Override
	public String say() {
		// TODO Auto-generated method stub
		return "Student say() ...";
	}
	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("AA");
		Student student = new Student();
	}

	@Override
	public String toString() {
		return "Student [score=" + score + ", desc=" + desc + ", info=" + info + "]";
}
	
	
	

}
