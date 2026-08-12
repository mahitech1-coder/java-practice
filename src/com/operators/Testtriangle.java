package com.operators;

import java.util.Scanner;

public class Testtriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int area;
		int perimeter;
		System.out.println("enter the base");
		int base = sc.nextInt();
		System.out.println("enter the height");
		int height = sc.nextInt();
		area = base * height;
		System.out.println("area of triangle is:" + area);
		System.out.println("*******************");
		System.out.println("enter the base");
		int base1 = sc.nextInt();
		System.out.println("enter the height");
		int height1 = sc.nextInt();
		perimeter = 2 * base1 * height1;
		System.out.println("perimeter of triangle is:" + perimeter);

	}

}
