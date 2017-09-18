package com.wen.javanew;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

public class Base64Demo {
	public static void main(String args[]) {
		try {
			String base64encodedString = Base64.getEncoder().encodeToString("runoob?java8".getBytes("utf-8"));
			System.out.println("Base64编码字符："+base64encodedString);
			byte[] base64encodedBytes = Base64.getDecoder().decode(base64encodedString);
			System.out.println("原始字符串："+new String(base64encodedBytes));
			base64encodedString =Base64.getUrlEncoder().encodeToString("TutorialsPoint?java8".getBytes("utf-8"));
			System.out.println("Base64编码字符："+base64encodedString);
			StringBuilder stringBuilder = new StringBuilder();
			for (int i = 0; i < 10; ++i) {
				stringBuilder.append(UUID.randomUUID().toString());
				
			}
			byte[] mimeBytes = stringBuilder.toString().getBytes("utf-8");
			String mimeEncodedString = Base64.getMimeEncoder().encodeToString(mimeBytes);
			System.out.println("Base64　编码字符串："+mimeEncodedString);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error:"+e.getMessage());
		}
	}

}
