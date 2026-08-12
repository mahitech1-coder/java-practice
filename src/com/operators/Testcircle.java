package com.operators;

import java.util.Scanner;

public class Testcircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int area;

		System.out.println("enter radius of circle");
		int r=sc.nextInt();
		area=(int) (3.14*r*r);
		System.out.println("the area is :"+area);
		System.out.println("**********************");
		System.out.println("enter radius of circle");
		int c = sc.nextInt();
		c = (int) (2 * 3.14 * r);
		System.out.println("the circumferencr is :" + c);

	}

}
