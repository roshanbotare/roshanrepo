package com.roshan.customeException;

public class invalidAmountException extends Exception {

	private static final long serialVersionUID = -2482197062805575743L;
	
	public invalidAmountException()
	{
		super();
	}

	
	public invalidAmountException(String errMessage)
	{
		super(errMessage);
	}
}
