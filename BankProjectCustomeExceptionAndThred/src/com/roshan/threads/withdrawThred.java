package com.roshan.threads;

import com.roshan.customeException.insufficientAmountException;
import com.roshan.customeException.invalidAmountException;
import com.roshan.service.BankAccount;

public class withdrawThred implements Runnable {
    
	private BankAccount acc;
	private double amt;
	
	public withdrawThred(BankAccount acc, double amt) throws InterruptedException {
		super();
		this.acc = acc;
		this.amt = amt;
	
		Thread t=new Thread(this);
		t.start();
		Thread.sleep(100);
	}

	
	@Override
	public void run() {
		
		try {
			acc.withdraw(amt);
			System.out.print(amt+" amount is withdraw in your account "+acc.getAccNum()+" available balance is ");
			acc.currentBalance();
			
			
		} catch (invalidAmountException | insufficientAmountException e) {
			System.out.println(e.getMessage());
		}
		
		
  
	}

}
