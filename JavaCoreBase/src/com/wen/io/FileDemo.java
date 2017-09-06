package com.wen.io;

import java.io.File;
import java.util.Date;


public class FileDemo {

	public static void main(String[] args) {
	
		File file =new File("D:\\github\\stujavacode\\JavaCoreBase\\src\\com\\jiekou\\Test.java");
		System.out.println(file.getAbsolutePath());
		System.out.println(new Date(file.lastModified()));
	}

}
