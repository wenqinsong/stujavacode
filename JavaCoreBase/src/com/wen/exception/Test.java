package com.wen.exception;

import java.util.InputMismatchException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Test {

	public static void main(String[] args) throws Exception {
		
		try {
			Exceotion exceotion=new Exceotion();
			
			exceotion.setAge();
			
		} catch (InputMismatchException age) {
			age.printStackTrace();
			System.out.println("输入错误");
			
			
		}

	}

}
