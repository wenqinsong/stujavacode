package com.jiekou;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class dd {

	public static void main(String[] strings) throws IOException {

		PrintStream ps = new PrintStream("/home/cent/Downloads/abc.txt");
		System.setOut(ps);

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");

			}
			System.out.println();
		}

	}

}
