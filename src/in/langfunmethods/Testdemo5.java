package in.langfunmethods;

import java.util.Scanner;

// write a program to print bank details for deposit and withdraw
public class Testdemo5 {
	double balance = 10000;

	void getdeposit(double amount) {
		System.out.println("deposit amount is:" + balance);
		balance = balance + amount;
	}

	void getwithdraw(double amount) {
		System.out.println("withdraw amount is:");
		balance = balance - amount;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Testdemo5 t = new Testdemo5();
		System.out.println("current balance is :" + t.balance);
		t.getdeposit(5000);
		t.getwithdraw(8000);
		System.out.println("main method ended");

	}

}
