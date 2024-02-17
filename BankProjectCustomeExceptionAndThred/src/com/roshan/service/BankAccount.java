package com.roshan.service;
import com.roshan.customeException.insufficientAmountException;
import com.roshan.customeException.invalidAmountException;

public interface BankAccount {
	
	public long  getAccNum();
	public void  deposite(double amt) throws invalidAmountException ;
	public double withdraw(double amt) throws invalidAmountException,insufficientAmountException ;
	public void currentBalance();

}
