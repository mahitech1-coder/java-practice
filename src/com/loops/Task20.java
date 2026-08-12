package com.loops;

import java.util.Scanner;

//WAP TO PRINT THE NUMBER IS PRIME OR NOT
public class Task20 {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range");
		int n1 = sc.nextInt();
		System.out.println("Enter the ending range");
		int n2 = sc.nextInt();
		for (int num1 = n1; num1 <= n2; num1++) {
			for(int i=1;i<=num;i++) {
			if (num1 % i == 0) {
				count++;
			}
			if (count == 2) {
				System.out.println("the number is prime");
			} else {
				System.out.println("the number is not prime");
			}
			System.out.println("the sum is:" + sum);
		}
	}

}
}

