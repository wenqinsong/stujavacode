package com.loop;

//import javax.swing.plaf.synth.SynthSpinnerUI;

public class Loop1 {

	public static void main(String[] args) {
		//while循环
		//int i =1;
		/*while(i <= 100) {
			System.out.println("第"+i+"遍：好好学习天天向上");
			i++;
		}*/
		/*do {
			
			System.out.println("第"+i+"遍：好好学习天天向上");
			i++;
		}while(i <= 100);*/
		final int SUM =6;
		for(int i =0,j =SUM; i < SUM;i++,j--) {
			System.out.println(i+"+"+j+"="+(i+j));
		}
	}

}
