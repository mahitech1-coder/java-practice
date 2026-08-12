package com.oops.Encapsulation;

public class Testdemo {

	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.sid=101;
//		s1.sname="mahesh";
//		s1.sage=23;
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.sage);
		s1.setSid(18);
		s1.setSname("mahesh");
		s1.setSage(23);
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getSage());
		
		

	}

}
