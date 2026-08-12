package com.exceptionhandling;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		String str = sc.next();

		try {
			int number = Integer.parseInt(str);
			System.out.println("Integer value:" + number);
		} catch (NumberFormatException e) {
			System.out.println("invalid number");
		}

	}

}
