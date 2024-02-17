package com.roshan.threads;

import com.roshan.customeException.invalidAmountException;
import com.roshan.service.BankAccount;

public class DepositeThread implements Runnable {

	private BankAccount acc;
	private double amt;
	
	public DepositeThread(BankAccount acc, double amt) throws InterruptedException {
		super();
		this.acc = acc;
		this.amt = amt;

		Thread t = new Thread(this);
		t.start();
		Thread.sleep(100);
		
	}

	@Override
	public void run() {
		try {
			
			acc.deposite(amt);
            System.out.print(amt + " is credited in your account " + acc.getAccNum()+" available balance is ");
			acc.currentBalance(); 
			
			
		} catch (invalidAmountException e) {

			System.out.println(e.getMessage());
		}

	}

}
