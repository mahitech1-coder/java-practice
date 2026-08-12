package com.loops;

import java.util.Scanner;

public class Testmultiplicatoion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");
		int number = sc.nextInt();
		for (int i = 1; i <= 10; i = number * i) {
			System.out.println(i);

		}
	}

}
