package com.loops;

import java.util.Scanner;

public class Testdemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}

	}

}
