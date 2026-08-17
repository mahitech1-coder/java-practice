package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticetaskAtm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int withdrawAmount = 0;
		try {
			System.out.println("enter the balance");
			int balance = sc.nextInt();
			System.out.println("enter the withdraw amount");
			int amount = sc.nextInt();
			if (amount > balance) {
				throw new IllegalArgumentException("amount should not be greater than balance");
			}

			if (amount <= balance) {
				withdrawAmount = balance - amount;

			} 
			System.out.println("the withdraw amount is:" + withdrawAmount);

		} catch (InputMismatchException |IllegalArgumentException e) {
			System.out.println("invalid input");

		} finally {
			System.out.println("thank you for using the atm");
		}

	}

}
