package in.langfun;

public class Testvariables {
//	the static variables we can store the data in (method area)
//	for instance variables we can store the data in (heap area)
//	for local variables we can store the data int(stack area)
	
//	we can declare variables in three ways
//	1.instance variables
//	2.static variables
//	3.local variables
	int sid=101;
	String sname="mahesh reddy";
	static int age =22;
	static String city="Hyderabad";
	
	
	public static void main(String args[]) {
		long phno=3455664555l;
		float marks=96;
		System.out.println("main method started");
//		For instance data we have to create a object reference variable
		Testvariables t=new Testvariables();
		System.out.println("student id:"+t.sid);
		System.out.println("student name is:"+t.sname);
//		for accessing the static we can access in 3 ways 1.directly 2.class name 3.object reference variable
//		for accessing the data directly
		System.out.println(age);
		System.out.println(city);
//		for accessing the data by using class name in static only not instance &local are permitted
		System.out.println("age is:"+Testvariables.age);
		System.out.println("city is:"+Testvariables.city);
//		for accessing the data by using object reference is possible for both static and instance but not local
		System.out.println(t.age);
		System.out.println(t.city);
//		for accessing  the data  in local variables directly
		System.out.println(phno);
		System.out.println(marks);
		
		
		
		
	}

}
