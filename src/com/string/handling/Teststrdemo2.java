package com.string.handling;

public class Teststrdemo2 {

	public static void main(String[] args) {
		String s1 = "java is simple it is easy to learn";// scp
		String s2 = new String();// heap
		System.out.println(s1 == s2);
		s2 = s2.intern();
		System.out.println(s1 == s2);
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.indexOf('a', s1.indexOf('a')+1));
		System.out.println(s1.indexOf('a', s1.indexOf('a', s1.indexOf('a')+1)+1));
		System.out.println(s1.indexOf("is"));
		System.out.println(s1.indexOf("is", s1.indexOf("is")+1));
		System.out.println(s1.indexOf('l',29,33));

	}

}
