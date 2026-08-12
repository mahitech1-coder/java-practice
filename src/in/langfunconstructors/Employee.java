package in.langfunconstructors;

public class Employee {
	int empid;
	String empname;
	double salary;
	Employee(int empid,String empname,double salary){
		this.empid=empid;
		this.empname=empname;
		this.salary=salary;
		System.out.println("employee id is:"+empid);
		System.out.println("employee name is:"+empname);
		System.out.println("empoyee salary is:"+salary);
	}

	public static void main(String[] args) {
		Employee e=new Employee(101,"mahesh",40000d);
			}

}
