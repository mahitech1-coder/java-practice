package in.langfun;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Testdemo3 {
BigInteger b;
BigDecimal d;
BigInteger b1=new BigInteger("958889458865003");
BigInteger b2=new BigInteger("958889458865003");

BigDecimal d1=new BigDecimal("50399200595885");
BigDecimal d2=new BigDecimal("59300298505069");


	public static void main(String[] args) {
		Testdemo3  t=new Testdemo3();

		System.out.println("addition is:"+t.b1.add(t.b2));
		System.out.println("subtraction is:"+t.b1.subtract(t.b2));
		System.out.println("multiplication is:"+t.b1.multiply(t.b2));
		System.out.println("division is:"+t.b1.divide(t.b2));
		
		System.out.println("division is:"+t.d1.divide(t.d2));
		


	}

}
