package com.logicalstatements;

import java.util.Scanner;

//wap for month number and month name using switch case
public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		switch (num) {
		case 1 -> System.out.println("jan");
		case 2 -> System.out.println("feb");
		case 3 -> System.out.println("march");
		case 4 -> System.out.println("april");
		case 5 -> System.out.println("may");
		case 6 -> System.out.println("june");
		case 7 -> System.out.println("july");
		case 8 -> System.out.println("august");
		case 9 -> System.out.println("sept");
		case 10 -> System.out.println("oct");
		case 11 -> System.out.println("nov");
		case 12 -> System.out.println("dec");
		default -> System.out.println("no data found");

		}
	}

}
