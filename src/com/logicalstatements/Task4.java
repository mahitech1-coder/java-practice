package com.logicalstatements;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=======Food Corner======");
		System.out.println("enter you categroy:");
		int n1 = sc.nextInt();
		switch (n1) {
		case 1 -> System.out.println("Starters");
		case 2 -> System.out.println("Main Course");
		case 3 -> System.out.println("Desserts");
		case 4 -> System.out.println("Ice Creams");

		}
		System.out.println("enter the item");
		String items = sc.next();
		switch (items1 ) {
		case 1:{

			System.out.println("1.veg manchuria price is-120/-");
			break;
		}
		case 2:{
			System.out.println("2.chicken 65 price is-180/-");
			break;
		}
		case 3:{
			
			System.out.println("3.french fries price is-100/-");
			break;
		}

		}
		case 2 -> {
			System.out.println("Main Course Menu");
			System.out.println("1.veg biryani price is-80/-");
			System.out.println("2.chicken biryani price is-300/-");
			System.out.println("3.fried rice price is-180/-");
			break;
		}
		case 3 -> {
			System.out.println("Desserts Menu");
			System.out.println("1.ice cream price is-80/-");
			System.out.println("2.gulab jamun price is-60/-");
			System.out.println("3.brownie price is-120/-");
			break;
		}
		case 4 -> {
			System.out.println("Drinks Menu ");
			System.out.println("1.coke price is-40/-");
			System.out.println("2.sprite  price is-40/-");
			System.out.println("3.Mango Juice is-70");
			break;
		}
		}
	}
}
