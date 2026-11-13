package com.oops.abstraction;

public class Testdemo2 {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.start();
		v.stop();
		System.out.println("*************");
		Vehicle v1 = new Bike();
		v1.start();
		v1.stop();

	}

}
