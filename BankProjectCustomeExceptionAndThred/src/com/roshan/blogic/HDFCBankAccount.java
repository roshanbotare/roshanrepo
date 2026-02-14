package com.roshan.blogic;

import com.roshan.customeException.insufficientAmountException;
import com.roshan.customeException.invalidAmountException;
import com.roshan.service.BankAccount;

public class HDFCBankAccount implements BankAccount {
	private long accNum;
	private String accHName;
	private double balance;
	
	public HDFCBankAccount(long accNum, String accHName, double balance) {
		super();
		this.accNum = accNum;
		this.accHName = accHName;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "HDFCBankAccount [accNum=" + accNum + ", accHName=" + accHName + ", balance=" + balance + "]";
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getAccHName() {
		return accHName;
	}
	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public void deposite(double amt) throws invalidAmountException{
		
		if (amt<=0) {
			throw new invalidAmountException("do not pass -tv number");
		}
		balance=balance+amt;
		
	}
	@Override
	public double withdraw(double amt) throws invalidAmountException, insufficientAmountException {
		if(amt <= 0) 
			throw new invalidAmountException("Do not pass -ve amount");
    	if(amt> balance) 
			throw new insufficientAmountException("balance is low");
    	
		return this.balance = this.balance-amt;
	}
	@Override
	public void currentBalance() {
	
		System.out.println("current balance is :"+balance);
	}
	
	
	

}

