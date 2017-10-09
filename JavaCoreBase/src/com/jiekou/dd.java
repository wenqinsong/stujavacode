package com.jiekou;

import java.util.ArrayList;
import java.util.List;


public class dd {


		public void display() {
			
			List list = new ArrayList();
			for(int i=1;i<=9;i++) {
				for (int j=1;j<=i;j++) {
					System.out.print(i+"*"+j+"="+(i*j)+"\t");
					list.add(i+"*"+j+"="+(i*j)+"\t");
				}
				System.out.println();
				list.add("\r\n");
			}
		
			
			
	}

	

}
