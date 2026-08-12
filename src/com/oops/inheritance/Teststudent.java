package com.oops.inheritance;
//Shallow copy
class Student implements Cloneable{
	int sid;
	String sname;
	Address address;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	
	
}
class Address{
	String city;

	public Address(String city) {
		this.city = city;
	}
	
}

public class Teststudent {

	public static void main(String[] args) throws Exception {
		Address add=new Address("hyderabad");
		Student s1=new Student(101,"mahesh",add);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("***********obj 1***************");
		Student s2=(Student)s1.clone();
		s2.sid=102;
		s2.sname="raju";
		s2.address.city="bng";
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("A FEW MOMENTS LATER");
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		
		
		
		

	}

}
