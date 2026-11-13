package com.oops.abstraction;

public class Addition implements Calculator{

	@Override
	public int calculate(int a, int b) {
		
		return a+b;
	}

}
