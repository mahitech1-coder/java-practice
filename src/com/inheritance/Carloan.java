package com.inheritance;

import java.util.Scanner;

public class Carloan {
	Scanner sc = new Scanner(System.in);

	String getuserinfo() {
		System.out.println("enter the username");
		String name = sc.next();
		return name;
	}

	int getuserage() {
		System.out.println("enter the user age");
		int age = sc.nextInt();
		return age;
	}

	double getsalary() {
		System.out.println("enter the user salary");
		double salary = sc.nextDouble();
		return salary;
	}

	int getcibilscore() {
		System.out.println("enter the user cibil score");
		int score = sc.nextInt();
		return score;
	}

	int getcarprice() {
		System.out.println("enter the car price");
		int price = sc.nextInt();
		return price;
	}

	int getdownpayment(int price) {
		System.out.println("enter the down payment amount");
		int payment = sc.nextInt();
		return price - payment;
	}

	int getloantenure() {
		System.out.println("enter the loan tenure");
		int tenure = sc.nextInt();
		return tenure;
	}

	public static void main(String[] args) {
		Carloan c1 = new Carloan();
		String name = c1.getuserinfo();
		int age = c1.getuserage();
		double salary = c1.getsalary();
		int score = c1.getcibilscore();
		int price = c1.getcarprice();
		int payment = c1.getdownpayment(price);
		int tenure = c1.getloantenure();
		if (age >= 21 && age <= 60 && salary >= 25000.00 && salary <= 100000.00 && score >= 300 && score <= 900) {
			System.out.println("loan is successful");
		} else {
			System.out.println("loan is rejected");
		}

	}

}
