package com.oops.abstraction;

public class Testbill {

	public static void main(String[] args) {
		Billcalc discount=(amount,value)->amount*10/100;
		Billcalc tax=(amount,value)->amount*9/100;;
		Billcalc finalbill=(amount,value)->amount-discount.calculate(amount, 0)+tax.calculate(amount, 0);
		System.out.println("discount is:"+discount.calculate(2000, 0));
		System.out.println("tax is:"+tax.calculate(2000, 0));
		System.out.println("finalbill is:"+finalbill.calculate(2000, 0));
		

	}

}
