package com.oops.Encapsulation;

public class Teststudent1 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
//		direct access is not possible
//		s1.sid=18;
//		s1.sname="virat";
//		s1.sage=34;
//		System.out.println(s1.sid);
//		System.out.println(s1.sname);
//		System.out.println(s1.sage);
		s1.setSid(18);
		s1.setSname("virat");
		s1.setSage(34);
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
		System.out.println(s1.getSage());

	}

}
