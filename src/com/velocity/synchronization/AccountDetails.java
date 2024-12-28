package com.velocity.synchronization;

public class AccountDetails implements Runnable {

	Account account = new Account();

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			makewithdrawal(500); //method calling

			// getBalance()
			if (account.getBalance() <= 0) { //0<=0
				System.out.println("Account is overdrawn>>>");
			}
		}
	}

	//t1 -> t2 enter
	private synchronized void makewithdrawal(int amt) { //500

		if (account.getBalance() >= amt) { //5000>=500
			System.out.println(Thread.currentThread().getName() + ">> is going to withdraw");
		}

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// getwithdraw() method
		int bal = account.getWithdraw(amt); //500
		System.out.println(Thread.currentThread().getName() + ">> complete withdrawal=" + bal);
	}

}
