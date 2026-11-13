package com.oops.abstraction;

public class Testmain {

	public static void main(String[] args) {
		Notification n=new EmailNotification();
		n.send("mahesh");
		Logger l=new EmailNotification();
		l.log();
		Notification n1=new SmsNotification();
		n1.send("mahesh");
		Logger l1=new SmsNotification();
		l1.log();
		
		
		

	}

}
