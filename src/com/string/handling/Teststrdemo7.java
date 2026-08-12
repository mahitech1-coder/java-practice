package com.string.handling;

import java.util.Scanner;

//Write a Java program to perform String Compression.
//The program should count the consecutive occurrences of each character in a given string and print the character followed by its count.
public class Teststrdemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		System.out.println("enter a string");
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			char ch = str.charAt(i);
			char ch1 = str.charAt(i + 1);
	 g4
			}

		}
		System.out.println("the count is:" + count);
	}

}
