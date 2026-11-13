package com.tasks;

import java.util.Scanner;

public class Schloarship {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int marks = sc.nextInt();
		System.out.println("enter the attendance");
		int attendance = sc.nextInt();
		System.out.println("enter the income");
		Double income = sc.nextDouble();
		if (marks >= 80) {
			if (attendance >= 75) {
				if (income <= 30000.00) {
					System.out.println("Schloarship eligible");
				} else {
					System.out.println("Not eligible(high income)");
				}
			} else {
				System.out.println("not eligible(low attendance)");
			}
		} else {
			System.out.println("not eligible(low marks)");
		}
	}

}
