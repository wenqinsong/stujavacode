package com.wen.duoxiancheng;


import java.io.FileOutputStream;


public class ChengFa {

	public void display() throws Exception {
		
		FileOutputStream fos = new FileOutputStream("/home/cent/Downloads/abc.txt");
		String s=null;
		for(int i=1;i<=9;i++) {
			for (int j=1;j<=i;j++) {
				if (i == j) {
					s=(i+"*"+j+"="+i*j+"\t"+"\n");
					System.out.print(s);
					
				}else {
					s=(i+"*"+j+"="+i*j+"\t");
					System.out.print(s);
				}
				
				fos.write(s.getBytes());
			}
			
		}
		fos.close();
		System.out.println("录入成功！");
			

	}

}
