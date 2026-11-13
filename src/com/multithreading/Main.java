package com.multithreading;

class Firstthread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}

class Secondthread extends Thread {
	@Override
	public void run() {
		for (char c = 'A'; c <= 'E'; c++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			;
			System.out.println(c);
		}

	}
}

public class Main {

	public static void main(String[] args) {
		Firstthread t1 = new Firstthread();
		Secondthread t2 = new Secondthread();
		t1.start();
		t2.start();

	}

}
