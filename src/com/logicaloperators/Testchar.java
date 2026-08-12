package com.logicaloperators;

import java.util.Scanner;

public class Testchar {

	public static void main(String[] args) {
		System.out.println("vowel characters");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a character");
		char ch = sc.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
			System.out.println("character is vowel");

		} else {
			System.out.println("Not vowel");

		}
	}

}
