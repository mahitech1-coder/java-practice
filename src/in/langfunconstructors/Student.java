package in.langfunconstructors;

public class Student {
	String name;
	int age;

	Student() {
		this("Mahesh Reddy");
		System.out.println("default constructor");
	}

	Student(String name) {
		this("mahi",23);
		this.name=name;
		System.out.println("one arg constructor");
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("two arg constructor");
	}

	public static void main(String[] args) {
		Student s = new Student("mahesh", 23);
		s.display();
		Student s1=new Student();
		s1.display();

	}

	void display() {
		System.out.println("student name is:" + name);
		System.out.println("student age is:" + age);
	}

}
