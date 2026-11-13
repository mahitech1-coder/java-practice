package com.oops.abstraction;

public class Testresult {

	public static void main(String[] args) {
		Result avg=(marks,subjects)->marks/subjects;
		Result per=(marks,subjects)->marks/subjects*100;
		Result total=(marks,subjects)->marks+subjects;
		System.out.println("average marks is:"+avg.calculate(450, 5));
		System.out.println("percentage is:"+per.calculate(450, 5));
		System.out.println("total marks is:"+total.calculate(450,5));
		
		

	}

}
