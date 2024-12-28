package com.velocity.synchronization;

public class MainExample {

	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
		Thread t1 = new Thread(accountDetails);
		Thread t2 = new Thread(accountDetails);
		t1.setName("ajay");
		t1.start();
		t2.setName("sachin");
		t2.start();
	}
}
