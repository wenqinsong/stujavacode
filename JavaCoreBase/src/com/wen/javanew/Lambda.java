package com.wen.javanew;

@SuppressWarnings("all")
public class Lambda {
	public static void main(String[] args) {
		Lambda tester = new Lambda();

		MathOperation addtion = (int a, int b) -> a + b;
		MathOperation subtraction = (a, b) -> a - b;
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10 + 5=" + tester.operate(10, 5, addtion));
		System.out.println("10 - 5=" + tester.operate(10, 5, subtraction));
		System.out.println("10 * 5=" + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5=" + tester.operate(10, 5, division));

	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);

	}

	interface GreetingService2 {
		void sayMessage();
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);

	}

}
