package com.oops.abstraction;

public interface Scanner {
	public   default void start() {
		System.out.println("Scanner starts to scan the documents");
	}

}
