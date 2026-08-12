package com.operators;

import java.util.Scanner;

public class Testbank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 20000;
		int deposit;
		int withdraw;
		System.out.println("enter the deposit amount");
		int amount = sc.nextInt();
		deposit = balance + amount;
		System.out.println("the deposit balance is:" + deposit);
		System.out.println("enter the withdraw amount");
		int cashdraw = sc.nextInt();
		withdraw = deposit - cashdraw;
		System.out.println("the withdraw amount is:" + withdraw);

	}

}
