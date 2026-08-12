package com.operators;

import java.util.Scanner;

public class Testrectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int area;
		System.out.println("enter the length");
		int l = sc.nextInt();
		System.out.println("enter the breadth");
		int b = sc.nextInt();
		area = l * b;
		System.out.println("area of rectangle is:" + area);
		System.out.println("****************");
		int perimeter;
		System.out.println("enter the length ");
		int l1 = sc.nextInt();
		System.out.println("enter the breadth");
		int b1 = sc.nextInt();
		perimeter = 2 * l1 * b1;
		System.out.println("the perimeter is:" + perimeter);
	}

}
