package com.exceptionhandling;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int balance = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the withdrawl amount");
		int withdrawAmount = sc.nextInt();
		if (withdrawAmount <= balance) {
			System.out.println("withdraw successful");

		}
		if (withdrawAmount > balance) {
			throw new IllegalArgumentException("insufficient balance");
		}

	}

}
