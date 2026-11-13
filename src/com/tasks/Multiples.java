package com.tasks;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println("Divisible by both 3 & 5");
		} else {
			System.out.println("Not Divisible by 3 & 5");
		}

	}

}
