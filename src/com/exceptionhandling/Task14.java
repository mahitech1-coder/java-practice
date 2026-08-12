package com.exceptionhandling;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if (age <= 18) {
			throw new IllegalArgumentException("age  must be 18 or above");
		} else {
			System.out.println("eligible to vote");
		}

	}

}
