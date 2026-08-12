package com.string.handling;

import java.util.Scanner;

//WAP TO PRINT MAX OCCURENCE OF A STRING
public class Testdemo8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		int[] arr = new int[127];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)] = arr[str.charAt(i)]+1;
		}
		int max = -1;
		char maxchar = ' ';
		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i)] > max) {
				max = arr[str.charAt(i)];
				maxchar = str.charAt(i);

			}
		}

		System.out.println("the maxchar is:" + maxchar);
	}

}
