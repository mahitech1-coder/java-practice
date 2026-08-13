package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int discount;
		int finalPrice;

		try {
			System.out.println("enter the product price");
			int p = sc.nextInt();
			if (p < 0) {
				throw new IllegalArgumentException("price should not be negative");
			}

			if (p >= 2000) {
				discount = p * 10 / 100;

			} else {
				discount = p * 5 / 100;
			}
			System.out.println("the discount amount is:" + discount);
			finalPrice = p - discount;
			System.out.println("the final price is:" + finalPrice);

		} catch (InputMismatchException |IllegalArgumentException e) {
			System.out.println("invalid input");
		} finally {
			System.out.println("shopping completed");
		}

	}

}
