package com.operators;
import java.util.Scanner;

public class Testdemo8 {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=sc.nextInt();
		System.out.println("number is:"+n1);
		if((n1&1)==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}

	}

}
