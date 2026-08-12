package com.tasks;

import java.util.Scanner;

//Level 1
//1. Print 1 to 10
//2. Print 10 to 1
//3. Print 1 to n
//4. Print n to 1
//5. Even numbers
//6. Odd numbers
//7. Sum 1 to n
//8. Factorial
//9. Multiplication table
//10. First n natural numbers
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int factorial = 1;
		System.out.println("enter a number");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;

		}
		System.out.println("The factorial is:" + factorial);
	}
}
