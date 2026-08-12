package com.loops;

import java.util.Scanner;

public class Demo2 {

	private static int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
			
		}

	}

}
