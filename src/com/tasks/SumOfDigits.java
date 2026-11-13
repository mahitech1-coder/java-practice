package com.tasks;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit = 0;
		int count = 0;
		System.out.println("enter a number");
		int num = sc.nextInt();
		while (num > 0) {
			digit = num % 10;
			if (digit % 2 != 0) {
				count++;

			}
			num = num / 10;
		}
	
		System.out.println("count is:" + count);
	}

}
