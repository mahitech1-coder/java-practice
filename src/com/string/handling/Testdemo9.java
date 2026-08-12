package com.string.handling;

import java.util.Scanner;

//WAP TO PRINT UNIQUE AND REMOVE THE DUPLICATE ELEMENTS
public class Testdemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		char result = ' ';
		int[] arr = new int[127];
		for (int i = 0; i < str.length(); i++) {
			char c = (char) arr[str.charAt(i)];
			if (arr[str.charAt(c)] == result);
				result = (char) (result + c);

			}
		System.out.println("the result is:" + result);
		}
		

