package com.wen.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import sun.security.provider.certpath.BuildStep;

@SuppressWarnings("all")

public class InputStramReaderDemo {

	public static void main(String[] args) {
	
		File file = new File("D:\\github\\Java6\\JavaCore\\src\\com\\ddb\\javacore\\io\\ObjectSeriDemo.java");
		
		
			try {
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				String s;
				s = br.readLine();
				
				while (null !=s) {
					System.out.println("Read:"+s);
					s = br.readLine();
				}
				br.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}


