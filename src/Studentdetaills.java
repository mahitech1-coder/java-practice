
import java.util.Scanner;

public class Studentdetaills {
	static void getstuName(String name) {
		System.out.println(name);
	}

	static void getstucity(String city) {
		System.out.println(city);
	}

	static void getphone(long phone) {
		System.out.println(phone);
	}

	static void getid(int id) {
		System.out.println(id);
	}

	static void getAadhaar(String aadhaar) {
		System.out.println(aadhaar);

	}

	static void getPan(String pan) {
		System.out.println(pan);

	}

	static void getFname(String name) {
		System.out.println(name);
	}

	static void getMname(String name) {
		System.out.println(name);
	}

	static void getSname(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String sname = sc.next();
		sc.nextLine();
		getstuName(sname);
		System.out.println("Enter your city:");
		String scity = sc.next();
		getstucity(scity);
		System.out.println("Enter your phone number:");
		long sphone = sc.nextLong();
		getphone(sphone);
		System.out.println("Enter your id:");
		int sid = sc.nextInt();
		getid(sid);
		System.out.println("Enter your aadhaar number:");
		String saadhaar = sc.next();
		getAadhaar(saadhaar);
		System.out.println("Enter your pan number:");
		String span = sc.next();
		getPan(span);
		System.out.println("My father name:");
		String fname = sc.next();
		getFname(fname);
		System.out.println("My mother name:");
		String mname = sc.next();
		getMname(mname);
		System.out.println("My sister name:");
		String name = sc.next();
		getSname(name);
		System.out.println("main method ended");
	}

}
