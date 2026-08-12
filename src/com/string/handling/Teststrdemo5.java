package com.string.handling;

import java.util.Scanner;

public class Teststrdemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("enter the string");
		String s1 = sc.next();
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
		}
		for (int j = 0; j < s1.length(); j++) {
			char ch = s1.charAt(j);
			count++;
		}
		System.out.println("the count is:"+count);
	}

}
