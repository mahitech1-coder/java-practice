package com.oops.abstraction;

public interface Printer {
	default void start() {
		System.out.println("printer starts printing");

	}

}
