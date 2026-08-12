package com.javaintroduction;

public class Testdemo2 {
	static {
		   System.out.println("static block1 started");
	   }

   public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("main method ended");
   }
   
   {
//	   instance block
	   System.out.println("Instance block started");
	   Testdemo2 t=new Testdemo2();
   }
   }
	
	



