package com.exceptionhandling;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] number = { 10, 20, 30, 40, 50 };
		System.out.println("enter the index:");
		int i = sc.nextInt();
		try {
			System.out.println("value is:" + number[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid index");
		} finally {
			System.out.println("array execution is completed");
		}

	}

}
