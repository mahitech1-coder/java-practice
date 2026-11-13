package com.tasks;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the username");
		String user = sc.next();
		System.out.println("enter the password");
		int pass = sc.nextInt();
		if (user.equals("admin")) {

			if (pass == 1234) {
				System.out.println("login successful");
			} else if (pass != 1234) {
				System.out.println("invalid password");
			}
		} else {
			System.out.println("invalid username");
		}

	}

}
