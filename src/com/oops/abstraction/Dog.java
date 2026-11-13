package com.oops.abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("BOW BOW ");
		
	}

	@Override
	public void drink() {
		System.out.println("Dog drinks water");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog eats biscuits and food");
		
	}

}
