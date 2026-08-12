package com.inheritance;

import java.util.Scanner;

public class Personalloan {
	Scanner sc = new Scanner(System.in);

	double getsalary() {
		System.out.println("enter your salary");
		double salary = sc.nextDouble();
		return salary;
	}

	int getcibilscore() {
		System.out.println("enter your cibil score");
		int cibil = sc.nextInt();
		return cibil;
	}

	int getage() {
		System.out.println("enter your age");
		int age = sc.nextInt();
		return age;
	}

	double getroi() {
		return 9.5;
	}

	public static void main(String[] args) {
		System.out.println("welcome to personal loan application");
		Personalloan pl = new Personalloan();
		double salary = pl.getsalary();
		int cibil = pl.getcibilscore();
		int age = pl.getage();

		if (salary >500000.00 && salary <= 100000.00 && cibil >= 300 && cibil <= 900 && age > 22 && age <= 60) {
			System.out.println("congratullations your are eligible for loan");
			double roi = pl.getroi();
			if (cibil > 300 && cibil < 600) {
				System.out.println("low cibil score");
				roi=roi+3.5;
			} else if (cibil >=600 && cibil < 700) {
				System.out.println("fair score for eligibility of the loan");
				roi=roi+2.5;
			} else if (cibil >= 700 && cibil < 900) {
				System.out.println("good cibil score");
				roi=roi+1.5;

			} else {
				System.out.println("you can move for the forther steps");
			}
			
			}
		else {
			System.out.println("sorry for the inconvince");
		}
	}
}
	
		
	

