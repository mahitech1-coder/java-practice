package com.oops.abstraction;

public class Testdemo {

	public static void main(String[] args) {
		Animal c = new Cat();
		c.sound();
		c.drink();
		c.eat();
		System.out.println("*****DOG INFO *******");
		Animal d = new Dog();
		d.sound();
		d.drink();
		d.eat();
	}

}
