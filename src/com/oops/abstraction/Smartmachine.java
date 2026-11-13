package com.oops.abstraction;

public class Smartmachine implements Printer, Scanner {

	@Override
	public void start() {

		Printer.super.start();
		Scanner.super.start();
		System.out.println("smart machine is printing");
	}

}
