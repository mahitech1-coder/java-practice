package in.langfunconstructors;

public class RestaurantBill {
	String name;
	String item;
	String quantity;
	float price;

	RestaurantBill(String name, String item, String quantity, float price) {
		this.name = name;
		this.item = item;
		this.quantity = quantity;
		this.price = price;

	}

	public static void main(String[] args) {
		RestaurantBill r=new RestaurantBill("mehfil","biryani","full",400);
		RestaurantBill r1=new RestaurantBill("food court","fried rice","full",250);
		RestaurantBill r2=new RestaurantBill("badam","juice","full",200);
		

	}

	void calcuateBill() {
		sysout

	}

}
