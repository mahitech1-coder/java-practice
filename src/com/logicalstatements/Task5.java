package com.logicalstatements;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("===ATM MENU===");
		System.out.println("enter the user choice");
		int choice=sc.nextInt();
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.check baance");
		System.out.println("4.exit");
		int balance=10000;
		System.out.println("balance is:"+balance);
		switch(choice) {
		
		case 1:{
			System.out.println("enter the deposit amount");
			int deposit=sc.nextInt();
			balance=balanc+deposit;
			System.out.println("updated balance is:"+balance);
		}
		case 2:{
			System.out.println("enter the withdraw amount");
			if(withdraw<=balnce) {
				balance=balance-withdraw;
				System.out.println("updated balnce is:"+balance);
				}
			else {
				System.out.println("not available balance");
			}
			
			}
		default:{
			System.out.println("not enough balance");
		}
		}
	}
}



