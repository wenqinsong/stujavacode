package com.wen.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDemo {

	public static void main(String[] args) {
		//创建对象
		File file= new File("C:\\Users\\Administrator\\Desktop\\RefBooks\\01JavaBase\\JDK_API_1_6_zh_CN.CHM");
		File file2=new File("C:\\\\Users\\\\Administrator\\\\Desktop\\\\RefBooks\\\\01JavaBase\\\\JDK_API_1_6_zh_CNBk.CHM");
		
		FileInputStream fis;
		FileOutputStream fos;
		
		try {
			fis =new FileInputStream(file);
			fos =new FileOutputStream(file2);
			
			int read =fis.read();
			while(read != -1) {
				
				fos.write(read);
				read = fis.read();
				
			}
			fis.close();
			fos.close();
			System.out.println("Copy OK!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
