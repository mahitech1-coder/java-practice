package com.loops;

import java.util.Scanner;

//Find the sum of numbers from 1 to 10.
public class Task18 {
	static int sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n1 = sc.nextInt();
		for (int i = 1;i<= 10; i++) {
			sum = sum + i;
			System.out.println("sum is:" + sum);
		}
	}

}
