package com.oops.abstraction;

public class Documnet implements Printable, Showable {

	@Override
	public void print() {
		System.out.println("printing document");

	}

	@Override
	public void show() {
		System.out.println("Showing document");

	}

}
