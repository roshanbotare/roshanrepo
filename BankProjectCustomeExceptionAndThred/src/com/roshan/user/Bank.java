package com.roshan.user;

import com.roshan.blogic.HDFCBankAccount;
import com.roshan.customeException.insufficientAmountException;
import com.roshan.customeException.invalidAmountException;
import com.roshan.service.BankAccount;
import com.roshan.threads.DepositeThread;
import com.roshan.threads.withdrawThred;

public class Bank {

	public static void main(String[] args) throws invalidAmountException, insufficientAmountException, InterruptedException {
		
		BankAccount acc1=new HDFCBankAccount(1111, "roshan", 5000);
		BankAccount acc2=new HDFCBankAccount(2222, "mahi", 10000.10);
		BankAccount acc3=new HDFCBankAccount(3333, "rohan",15000.10);
		
		System.out.println("==========================================================");
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println();
		
		System.out.println("==========================================================");
		DepositeThread dt1=new DepositeThread(acc1, 5000); System.out.println();
		DepositeThread dt2=new DepositeThread(acc2, 10000);System.out.println();
		withdrawThred   wt1=new withdrawThred(acc1, 1000);System.out.println();
		withdrawThred   wt2=new withdrawThred(acc2, 1000);System.out.println();
		
		Thread.sleep(1000);
		System.out.println("==========================================================");
		System.out.println(acc1);System.out.println();
		System.out.println(acc2);System.out.println();
		System.out.println(acc3);System.out.println();
		
	}

}
