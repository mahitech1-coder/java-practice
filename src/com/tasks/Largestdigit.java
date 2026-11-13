package com.tasks;

import java.util.Scanner;

public class Largestdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int largest = 0;

		int digit = 0;
		System.out.println("enter a number");
		int num = sc.nextInt();
		while (num > 0) {
			digit = num % 10;
			if (digit > largest) {
				largest = digit;
			}
			num = num / 10;

		}
		System.out.println("the largest digit is:" + largest);

	}

}
