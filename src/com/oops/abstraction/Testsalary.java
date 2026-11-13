package com.oops.abstraction;

public class Testsalary {

	public static void main(String[] args) {
		Salarycalculator bonus=(salary,value)->salary*10/100;
		Salarycalculator tax=(salary,value)->salary*5/100;
		Salarycalculator finalsalary=(salary,value)->salary+bonus.calculate(salary, 0)-tax.calculate(salary, 0);
		System.out.println("bonus is:"+bonus.calculate(50000, 0));
		System.out.println("tax is:"+tax.calculate(50000, 0));
		System.out.println("final salary is:"+finalsalary.calculate(50000, 0));

	}

}
