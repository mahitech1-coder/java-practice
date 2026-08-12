package com.operators;

import java.util.Scanner;

public class Testshopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bill;
		System.out.println("enter the price of one item");
		int price = sc.nextInt();
		System.out.println("enter the quantity of item");
		int quantity = sc.nextInt();
		System.out.println("enter the packing charges");
		int charges = sc.nextInt();
		System.out.println("enter the discount");
		int discount=sc.nextInt();
		bill = price * quantity;
		bill += charges;
		bill-=discount;
		System.out.println("the final bill is:" + bill);

	}

}
