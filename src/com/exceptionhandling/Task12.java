package com.exceptionhandling;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = { 10, 20, 30, 40, 50 };
		System.out.println("enter the index:");
		int i = sc.nextInt();
		System.out.println("enter the divisor:");
		int d = sc.nextInt();
		try {
			int result = number[i] / d;
			System.out.println("array value is:" + number[i]);
			System.out.println("result is:" + result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid array index");
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}

	}

}
