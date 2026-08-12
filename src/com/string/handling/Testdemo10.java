package com.string.handling;

import java.util.Scanner;

public class Testdemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		int count = 0;
		int[] freq = new int[127];
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		// Find the first non-repeated character
		boolean found = false;

		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] == 1) {
				System.out.println("First non-repeated character: " + str.charAt(i));
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("No non-repeated character found.");
		}

		sc.close();
	}

}
