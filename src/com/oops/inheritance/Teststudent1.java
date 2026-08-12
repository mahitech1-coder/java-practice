package com.oops.inheritance;

//Deep copy
class Student1 {
	int age;
	String name;
	Address1 add;

	public Student1(int age, String name, Address1 add) {
		super();
		this.age = age;
		this.name = name;
		this.add = add;
	}

	public Student1(Student1 s) {
		this.age = s.age;
		this.name = s.name;
		this.add = new Address1(s.add);

	}
}

	class Address1 {
		String city;

		public Address1(String city) {

			this.city = city;
		}
			public Address1(Address1 add) {
				this.city=add.city;
			}
		

	}
	

	public class Teststudent1 {

		public static void main(String[] args) {
			Address1 add = new Address1("hyderabad");
			Student1 st1 = new Student1(101, "mahesh", add);
			System.out.println(st1.age);
			System.out.println(st1.name);
			System.out.println(st1.add.city);
			System.out.println("*********obj1**********");
			Student1 st2 = new Student1(st1);
			st2.age = 21;
			st2.name = "raju";
			st2.add.city = "chennai";
			System.out.println(st2.age);
			System.out.println(st2.name);
			System.out.println(st2.add.city);
			System.out.println("A FEW MOMENTS LATER");
			System.out.println(st1.age);
			System.out.println(st1.name);
			System.out.println(st1.add.city);

		}

	}

