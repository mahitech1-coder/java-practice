package com.operators;

import java.util.Scanner;

public class Testaccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int deposit;
		int withdraw;
		System.out.println("ente the initial balance");
		int balance = sc.nextInt();
		System.out.println("enter the deposit amount");
		int amount = sc.nextInt();
		deposit=balance+amount;
		System.out.println("enter the withdraw balance");
		int draw = sc.nextInt();
		
		if (draw > balance) {
			System.out.println("insufficient balance");

		}else {
			withdraw = deposit - draw;
			System.out.println("the final balance is:" + withdraw);
		}
		

	}

}
