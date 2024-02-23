package com.roshan.factory;

public class MobileFactory {
	
	private int mobile;
	private boolean mobilesAvailable;
	
   public	synchronized void produce(int mobile)
	{
		if (mobilesAvailable) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.mobile=this.mobile+mobile;
		System.out.println("mobile are produced :: "+mobile);
		mobilesAvailable=true;
		this.notify();
	}
	
	public synchronized void consume(int mobile)
	{
		if (!mobilesAvailable) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.mobile=this.mobile-mobile;
		System.out.println(" mobile are consumed ::"+mobile);
	    mobilesAvailable=false;
	    
	    this.notifyAll();
	    
	}

}
