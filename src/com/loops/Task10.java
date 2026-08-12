package com.loops;

import java.util.Scanner;

//WAP TO PRINT FACTORS OF GIVEN NUMBER USING FOR LOOP
public class Task10 {
	static void findFactors(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		findFactors(n);
		
	}

}
