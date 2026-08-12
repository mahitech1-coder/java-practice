package com.exceptionhandling;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 5000;
		System.out.println("enter the withdraw amount:");
		int withdrawAmount = sc.nextInt();
		if (withdrawAmount > balance) {
			throw new IllegalArgumentException("invalid withdraw amount");
		}
		
			System.out.println("insufficient balance");
	
			else { 
			System.out.println("withdraw successful");
		}

	}
}



