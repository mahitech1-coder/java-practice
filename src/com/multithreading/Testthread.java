package com.multithreading;

public class Testthread extends Thread  {
	@Override
	public void run() {
		System.out.println("run method started");
		for(int i=0;i<=10;i++) {
			System.out.println("main:"+i);
		}
		System.out.println("run method ended");
	}
		
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Testthread t=new Testthread();
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("main:"+i);
		}
		System.out.println("main method ended");

	}

}
