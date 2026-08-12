package com.string.handling;

public class Teststrdemo1 {

	public static void main(String[] args) {
		String str="";
		String str1=null;
		String str2=" ";
		System.out.println(str.isEmpty());//true
		System.out.println(str.isBlank());//true
		System.out.println(str2.isEmpty());//false
		System.out.println(str2.isBlank());//true
		System.out.println(str1.isEmpty());//null.anything=null pointer exception
		System.out.println(str1.isBlank());//null.anything=null pointer exception
		

	}

}
