package com.operators;

import java.util.Scanner;

public class Testsquare {

	public static void main(String[] args) {
		int area;
		int perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter area of square");
		int s = sc.nextInt();
		area = s * s * s;
		System.out.println("area of square is:" + area);
		System.out.println("***************");
		System.out.println("enter perimeter of square");
		int p = sc.nextInt();
		perimeter = 2 * s * s;
		System.out.println("the perimeter of square is:" + perimeter);

	}

}
