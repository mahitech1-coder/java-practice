package com.loops;

import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter a number:");
		int n = sc.nextInt();

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				sum = sum + i;
			System.out.println("sum of even numbers is:" + sum);
		}

	}

}
