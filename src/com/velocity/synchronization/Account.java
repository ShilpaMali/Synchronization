package com.velocity.synchronization;

//why we use synchronization
public class Account {

	// Declare & initialize balance variable as 5000
	private int balance = 5000; //4500

	/*
	 * Design method as getBalance() which return balance to that method
	 */
	public int getBalance() {
		return balance; //5000 amount will be return to getBalance() method
	}

	/*
	 * Design method as getWithdraw(int amount) //500
	 */
	public int getWithdraw(int amount) { //500
		balance = balance - amount; //5000-500=>4500
		return balance; //4500
	}

}
