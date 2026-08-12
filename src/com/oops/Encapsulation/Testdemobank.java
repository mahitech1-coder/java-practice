package com.oops.Encapsulation;

public class Testdemobank {

	public static void main(String[] args) {
	Bank b1=new Bank();
	b1.setAccno(101);
	b1.setAccno(102);
	b1.setAccname("mahesh");
	b1.setAccname("raju");
	b1.setBalance(2000);
	b1.amount=1000;
//	b1.amount=2000;
	System.out.println(b1.getAccno());
	System.out.println(b1.getAccname());
	System.out.println(b1.getBalance());
	b1.deposit();
	b1.withdraw();

	}

}
