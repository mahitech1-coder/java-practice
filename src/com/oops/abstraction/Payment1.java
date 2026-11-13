package com.oops.abstraction;

public interface Payment1 {
	void pay(double amount);

	default void show() {
		System.out.println("receipt generated");
	}

}
