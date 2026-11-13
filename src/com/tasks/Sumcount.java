package com.tasks;

import java.util.Scanner;

public class Sumcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int digit=0;
		System.out.println("enter a number");
		int num = sc.nextInt();
		while (num > 0) {
			digit = num % 10;
			sum = sum +digit;
			num=num/10;
		}
		System.out.println("the sum is:" + sum);

	}

}
