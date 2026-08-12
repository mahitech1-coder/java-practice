package com.exceptionhandling;

public class Task4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int arr[] = { 10, 40, 50, 60 };
		try {
			int result = a / b;
			System.out.println(result);
			System.out.println(arr[6]);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");

		} finally {
			System.out.println("program continues");
		}

	}

}
