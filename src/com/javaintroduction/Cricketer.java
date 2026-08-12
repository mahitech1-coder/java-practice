package com.javaintroduction;

public class Cricketer {
//	instance
	String cricketerName;
	int jerseyNo;
//	static
	static String countryName;
	static int countryId;

	public static void main(String[] args) {
		System.out.println("INDIA TEAM INFO");
//		Accessing the data
		countryName="INDIA";
		countryId=+91;
//		creatin the object
		System.out.println("****OBJECT 1 INFO****");
		System.out.println("country Name is:"+countryName);
		System.out.println("country Id is:"+countryId);
		 Cricketer KL= new Cricketer();
		 KL.cricketerName="KL RAHUL";
		 KL.jerseyNo=1;
		 System.out.println("jersey No is:"+KL.jerseyNo);
		System.out.println("cricketer Name is:"+ KL.cricketerName);
//		
		System.out.println("****OBJECT 2 INFO****");
		System.out.println("country Name is:"+countryName);
		System.out.println("country Id is:"+countryId);
		 Cricketer surya= new Cricketer();
		 surya.cricketerName="SURYA KUMAR YADAV";
		 surya.jerseyNo=63;
		 System.out.println("jersey No is:"+surya.jerseyNo);
		System.out.println("cricketer Name is:"+ surya.cricketerName);
//		
		System.out.println("****OBJECT 3 INFO****");
		System.out.println("country Name is:"+countryName);
		System.out.println("country Id is:"+countryId);
		 Cricketer abhi= new Cricketer();
		 abhi.cricketerName="ABHISHEK SHARMA";
		 abhi.jerseyNo=8;
		 System.out.println("jersey No is:"+abhi.jerseyNo);
		System.out.println("cricketer Name is:"+abhi.cricketerName);
		
	}

}
