package in.langfunconstructors;

public class Student2 {
	int id;
	String name;
	String course;
	Student2(){
		name="unknown";
		course="not assigned";
		System.out.println("no arg constructor");
		System.out.println("student id:"+id);
		System.out.println("student name :"+name);
		System.out.println("student course is:"+course);
	}
	

	public static void main(String[] args) {
		Student2 s=new Student2();
		
	}

}
