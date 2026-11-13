package com.oops.abstraction;

//An employee earns ₹60,000 per month.
//
//The company applies these rules:
//
//Employee receives a 15% bonus.
//After adding the bonus, the company deducts 8% tax from the increased salary.
//Calculate the final salary.
public class Testsal {

	public static void main(String[] args) {
		Salcalc sal=(salary)->salary;
		Salcalc bonus = (salary) -> salary * 15 / 100;
		Salcalc afterbonus = (salary) -> salary+salary * 15 / 100;
		Salcalc tax = (salary) ->(salary+salary * 15 / 100)*8/100;
		Salcalc finalsalary = (salary) ->salary+salary * 15 / 100-(salary+salary * 15 / 100)*8/100;
		System.out.println("salary is:"+sal.calculate(60000));
		System.out.println("bonus is:" +bonus.calculate(60000));
		System.out.println("after bonus is:"+afterbonus.calculate(60000));
		System.out.println("tax is:" + tax.calculate(60000));
		System.out.println("final salary is:" + finalsalary.calculate(60000));

	}
		

}
