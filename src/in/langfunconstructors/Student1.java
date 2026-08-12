package in.langfunconstructors;

public class Student1 {
	int sid;
	String sname;
	String course;
	float fee;

	Student1() {
		this("mahesh");//call 1arg
		System.out.println("no arg constructor");
	}

	Student1(String sname) {
		this.sname = sname;
		System.out.println("student name is:" + sname);
	}

	Student1(String sname, String course) {
		this.sname = sname;
		this.course = course;
		System.out.println("student name is:" + sname);
		System.out.println("course is:" + course);
	}

	Student1(int sid, String sname, String course, float fee) {
		this.sid = sid;
		this.sname = sname;
		this.course = course;
		this.fee = fee;
		System.out.println("student id is:" + sid);
		System.out.println("student name is:" + sname);
		System.out.println("student course is:" + course);
		System.out.println("student fee is:" + fee);
	}

	public static void main(String[] args) {
		Student1 s = new Student1();
		Student1 s1 = new Student1("tirumala engineering college");
		Student1 s2 = new Student1("TEC", "CSE");
		Student1 s3 = new Student1(128, "TEC", "CSE", 200000f);
	}

}
