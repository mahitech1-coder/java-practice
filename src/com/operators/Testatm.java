package com.operators;

import java.util.Scanner;

public class Testatm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deposit;
		int withdraw;
		int pin = 1234;
		int newpin;
		System.out.println("enter the balance ");
		int balance = sc.nextInt();
		System.out.println("1.deposit");
		System.out.println("2.withdraw");
		System.out.println("3.check balance");
		System.out.println("4.change pin");
		System.out.println("5.Exit");
		System.out.println("enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1 -> {
			System.out.println("enter the deposit amount");
			int depositAmount = sc.nextInt();
			deposit = balance + depositAmount;
			System.out.println("the final balance is:" + deposit);

		}
		case 2 -> {
			System.out.println("enter the withdraw amount");
			int withdrawAmount = sc.nextInt();
			withdraw = balance - withdrawAmount;
			if (withdrawAmount > balance) {
				System.out.println("insufficient balance");
			} else {
				withdraw = balance - withdrawAmount;
				System.out.println("the final balance is:" + withdraw);
			}

		}
		case 3 -> {
			System.out.println("the final balance is:" + balance);
		}
		case 4 -> {
			System.out.println("enter current pin");
			int enteredpin = sc.nextInt();
			if (enteredpin == pin) {
				System.out.println("Access granted");
				System.out.println("enter the new pin");
				int Newpin = sc.nextInt();

				System.out.println("pin changed successfully");

			} else {
				System.out.println("incorrect pin");
			}
		}
		case 5 -> {
			System.out.println("Exit");
		}
		default -> {
			System.out.println("invalid inputs");
		}

		}
	}

}
