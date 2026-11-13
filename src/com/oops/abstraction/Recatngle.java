package com.oops.abstraction;

public class Recatngle extends Shape {
	int length;
	int breadth;

	Recatngle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		
	}

	@Override
	double area() {

		return length * breadth;
	}

}
