package com.tasks;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("invalid inputs");
		} else if (num <= 100) {
			System.out.println("low CONSUMPTION");

		} else if (num <= 200) {
			System.out.println("medium CONSUMPTION");
		} else if (num <= 300) {
			System.out.println("high CONSUMPTION");
		} else {
			System.out.println("VERY HIGH CONSUMPTION");
		}

	}

}
