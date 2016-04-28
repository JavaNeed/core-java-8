package com.misc.common;

public class Java8Tester {

	public static void main(String[] args) {
		Java8Tester tester = new Java8Tester();

		// with type declaration
		MathOperation addition = (int a, int b) -> a+b;

		// without type declaration
		MathOperation subtraction = (a,b) -> a-b;

		System.out.println("10 + 5 : "+tester.operate(10, 5, addition));
		System.out.println("10 - 5 : "+tester.operate(10, 5, subtraction));

		//with return statement along with curly braces
		MathOperation multi = (int a, int b) -> { return a * b; };
		System.out.println("10 * 5 : "+multi.operation(10, 5));

		//without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;
		System.out.println("10 / 5 : " + tester.operate(10, 5, division));
	}

	private int operate(int a, int b, MathOperation mathOperation){
		return mathOperation.operation(a, b);
	}
}
