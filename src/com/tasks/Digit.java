package com.tasks;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("enter a number");
		int num = sc.nextInt();
		while (num > 0) {
			num = num / 10;
			count++;
		}
		System.out.println("the digits are:" + count);

	}

}
