package com.tasks;

import java.util.Scanner;

public class Admission {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks");
		int marks = sc.nextInt();
		System.out.println("enter the attendence");
		int attendance = sc.nextInt();
		if (marks >= 40) {
			if (attendance >= 75) {
				System.out.println("Eligible");
			} else {
				System.out.println("not eligible");
			}

		} else {
			System.out.println("low marks");
		}
	}

}
