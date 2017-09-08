package com.wen.io;

import java.io.File;
import java.util.Date;


public class FileDemo {

	public static void main(String[] args) {
	
		File file =new File("D:\\github\\stujavacode\\JavaCoreBase\\src\\com\\jiekou\\Test.java");
		File file2=new File("D:\\github\\java4");
		File file3=new File("D:\\abc.txt");
		
		//判断路径是否存在
		System.out.println(file.exists());
		System.out.println(file2.exists());
		
		//判断是否为目录
		System.out.println(file.isDirectory());
		System.out.println(file3.isDirectory());
		
		//列出目录下的内容
		System.out.println("列出目录下的内容：");
		for (String string : file3.list()) {
			System.out.println(string);
			
		}
		
		//文件长度
		System.out.println(file.length());
		
		//最后修改时间
		System.out.println(new Date(file.lastModified()));
		System.out.println(new Date(file.lastModified()));
		
		//获取绝对路径
		System.out.println(file.getAbsolutePath());
		
		
		
	}

}
