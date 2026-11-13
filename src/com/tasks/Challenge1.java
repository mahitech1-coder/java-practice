package com.tasks;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("Divisible by both 2 & 3");
		} else if (num % 2 == 0) {
			System.out.println("Divisble by 2");
		} else if (num % 3 == 0) {
			System.out.println("Divisible by 3");
		} else {
			System.out.println("Not Divisible by either");
		}

	}

}
