package com.wen;

import java.util.Scanner;
public class Test4 {

	
	
	public static void main(String[] args) {
	Scanner yuan=new Scanner(System.in);
	System.out.println("请输入几行：");
	int n=yuan.nextInt();
	int i,j;
	for(i=1;i<=n;i++){
	for(j=1;j<=n+(n-1);j++){
	if((i==n+1-j)||(i==j-(n-1))||(i==n))
	System.out.print('*');
	else
	System.out.print(' ');
	}System.out.println();
	} 
	}
}
