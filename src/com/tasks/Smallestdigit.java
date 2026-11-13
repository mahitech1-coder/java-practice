package com.tasks;

import java.util.Scanner;

public class Smallestdigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int digit = 0;
		int smallest = 5;
		;
		System.out.println("enter a number");
		int num = sc.nextInt();
		while (num > 0) {
			digit = num % 10;
			if (digit > 5) {
				
				smallest = digit;

			}
			num = num / 10;
		}
		System.out.println("smalllest is:" + smallest);

	}

}
