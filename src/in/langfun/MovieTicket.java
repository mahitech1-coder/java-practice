package in.langfun;

public class MovieTicket {
	String cname;
	String moviename;
	int numoftickets;
	String seatname;
	int ticketprice=150;
	static String theatrename;
	void calculation() {
		int totalprice;
		totalprice= numoftickets*ticketprice;
		System.out.println(totalprice);
		
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		MovieTicket m =new MovieTicket();
		m.cname="MAHESH";
		m.moviename="MAHARSHI";
		m.numoftickets=4;
		m.seatname="silver";
		MovieTicket.theatrename="Sudharshan Theatre";
		System.out.println("Customer name is:"+m.cname);
		System.out.println(" Movie name is:"+m.moviename);
		System.out.println("Number of tickets:"+m.numoftickets);
		System.out.println("Seat  name is:"+m.seatname);
		System.out.println("theatre name is:"+MovieTicket.theatrename);
		System.out.println("Ticket price is:"+m.ticketprice);
		m.calculation();
	}

}
