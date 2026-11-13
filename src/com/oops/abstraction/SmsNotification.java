package com.oops.abstraction;

public class SmsNotification implements Notification, Logger {

	@Override
	public void send(String message) {
		System.out.println("SMS SENT:" + message);

	}

}
