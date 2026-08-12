package com.oops.inheritance;

import java.util.Scanner;

public class Personalloan {
	static Scanner sc = new Scanner(System.in);
	 boolean isPhonevalid(){
		System.out.println("enter you phone number");
		String phone=sc.next();
		boolean isPhonevalid=phone.matches("[6-9][0-9] {9}");
		return isPhonevalid;
	}
	 boolean isAadharvalid() {
		 System.out.println("enter your Aadhhar number");
		 String Aadhar=sc.next();
		 boolean isAadharvalid=Aadhar.matches("[0-9]{12}");
		 return isAadharvalid;
	 }
	

	double getcustomerSalary() {
		System.out.println("enter the salary");
		double income = sc.nextDouble();
		return income;
	}

	int getcibilScore() {
		System.out.println("enter you cibil score");
		int cibil = sc.nextInt();
		return cibil;
	}

	int getAge() {
		System.out.println("enter you age");
		int age = sc.nextInt();
		return age;
	}

	double getROI() {
		return 9.5;
	}

	public static void main(String[] args) {
		System.out.println("welcome to personal loan");
		Personalloan p1 = new Personalloan();
		double income = p1.getcustomerSalary();
		int cibil = p1.getcibilScore();
		int age = p1.getAge();

		if ((age >= 22 && age <= 60) && income >= 50000.00 && cibil > 300 && cibil <= 900 && p1.isPhonevalid() && p1.isAadharvalid() ) {
			System.out.println("congratulaltions you are eligible for personal loan ");
			double roi = p1.getROI();
			if (cibil > 300 && cibil <= 599) {
				System.out.println("poor score");
				roi = roi + 3.5;
			} else if (cibil > 600 && cibil <= 750) {
				System.out.println("good score");
				roi = roi + 2.5;
			} else if (cibil > 750 && cibil <= 900) {
				System.out.println("you are score is excellent");
				roi = roi - 2.5;
			}else {
				roi=roi-1.5;
			}
			System.out.println("The rate of interest is:"+roi);
		} else {
			System.out.println("sorry you are not eligible");
		}

	}

}
