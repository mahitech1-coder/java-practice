package com.string.handling;

import java.util.Scanner;

public class Teststrdemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first string");
		String s1 = sc.next();
		System.out.println("enter the second string");
		String s2 = sc.next();
		if (s1.length() == s2.length()) {
			System.out.println("it is anagram");
		} else {
			System.out.println("not anagtram");
		}

	}

}
