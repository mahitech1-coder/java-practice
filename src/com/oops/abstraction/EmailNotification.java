package com.oops.abstraction;

public class EmailNotification implements Notification, Logger {

	@Override
	public void send(String message) {
		System.out.println("email sent:" + message);

	}

}
