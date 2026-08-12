package com.loops;

import java.util.Scanner;

//Find the sum of numbers from 1 to n.
public class Testdemo24 {

	public static void main(String[] args) {
		int sum = 0;
		int n = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n1=sc.nextInt();
		for(int i=1;i<=n1;i++) {
			sum=sum+i;
		}
		
		System.out.println("the sum is:"+sum);
	}
}