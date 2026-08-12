package com.oops.Encapsulation;

public class Bank {
	private int accno;
	private String accname;
	private int balance;
	int amount;

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	void deposit() {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("deposited successfulll:" + balance);

		} else {
			System.out.println("invalid");
		}
	}

	void withdraw() {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("withdraw amount:" + balance);
		} else {
			System.out.println("insufficent balance");
		}

	}

}
