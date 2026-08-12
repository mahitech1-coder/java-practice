package in.langfun;

public class Hospital {
   static String hname;
	int pid;
	String pname;
	float tcost;
	void calculatebill() {
		float tax=tcost*12/100;
		double totalbill;
		totalbill=tcost+tax;
		System.out.println("total bill is:"+totalbill);
		
		System.out.println("hospital name is:"+Hospital.hname);
		System.out.println("patient id is:"+pid);
		System.out.println("patient name is:"+pname);
		System.out.println("treatment cost is:"+tcost);
		
	}

	public static void main(String[] args) {
		Hospital h = new Hospital();
		Hospital.hname="KIMS HOSPITAL";
		h.pid=101;
		h.pname="Raju";
		h.tcost=20000f;
		h.calculatebill();
	}

}
