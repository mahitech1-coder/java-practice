package com.tasks;

import java.util.Scanner;

//12. Sum of digits
public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("enter the digits");
		int n = sc.nextInt();
		for (int i = n; i != 0; i = i % 10) {
			sum = sum + 1;
		}
		System.out.println("The sum is:" + sum);

	}

}
