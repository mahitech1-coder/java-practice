package com.exceptionhandling;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("enter the second mumber:");
		int num2 = sc.nextInt();
		try {
			int result = num1 / num2;
			System.out.println("the result is:" + result);

		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		} finally {
			System.out.println("program compelted");
		}

	}
}
