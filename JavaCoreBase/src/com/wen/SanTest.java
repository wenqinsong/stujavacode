package com.wen;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("all")
public class SanTest {

	// 定义一个倒三角的类，有主方法和 输出倒等腰三角形方法

	public static void main(String[] args) {
		printDengyao();
		// 定义主方法，程序从这里开始
		// 调用输出倒三角形的方法，*数为10， 即高度（层）也为10
		// 10可以换成任何整型值
	}

	public static void printDengyao() {
		// 定义一个输出倒三角的方法

		Scanner input = new Scanner(System.in);
		int x, y;
		try {
			x = input.nextInt();
		} catch (InputMismatchException ime) {
			// TODO Auto-generated catch block
			ime.printStackTrace();

			return;
		}
		// y=input.nextInt();
		for (int i = 0; i < x; i++) {
			// 要输出的整体（全部多少行）用这个for循环控制
			System.out.println(" "); // 输出一行*后跳到下一行
			for (int j = i; j < x; j++) {
				// 这个循环用来输出*，他的数目有传入的参数x决定
				System.out.print(" ");

				// 如：i=0时即第一行，输出x个“*”
			}
			for (int j = 0; j < i + 1; j++) {
				// 这个循环用来输出空格，以达到输出倒等腰三角形的效果
				System.out.print("*");
			}
		}

	}
}
