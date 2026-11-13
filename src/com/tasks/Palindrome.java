package com.tasks;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rev = 0;
		int digit = 0;
		System.out.println("enter a number ");
		int num = sc.nextInt();
		int original = num;
		while (num > 0) {
			digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;

		}
		if (original == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

}
