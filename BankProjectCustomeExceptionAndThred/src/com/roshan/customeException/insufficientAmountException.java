package com.roshan.customeException;

public class insufficientAmountException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public insufficientAmountException()
	{
		super();
	}
	
	public insufficientAmountException(String errMessage)
	{
		super(errMessage);
	}

}
