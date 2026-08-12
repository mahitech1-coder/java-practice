package com.oops.Encapsulation;

class student2 {
	int sid;
	String sname;
	Address address;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public student2(int sid, String sname, Address address) {
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
public class Teststudent2{

	public static void main(String[] args) {
		Address add=new Address("hyderabad");
		student2 s1=new student2(101,"mahesh", add);
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		
		
	}

}
}

