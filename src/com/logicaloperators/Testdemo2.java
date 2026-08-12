package com.logicaloperators;

import java.util.Scanner;

public class Testdemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter a number");
		int num1=sc.nextInt();
		if(num1%2==0) {
			System.out.println("number is even");
			
		}else {
			System.out.println("number is odd");
		}
		
		
	}

}
