package com.roshan.consumer;

import com.roshan.factory.MobileFactory;

public class MobileConsumer implements Runnable {

	private MobileFactory mobileFactory;
	
	public MobileConsumer(MobileFactory mobileFactory) {
		super();
		this.mobileFactory = mobileFactory;
	}
	@Override
	public void run() {
		
	for (int i = 1; i <=10; i++) {
		mobileFactory.consume(i);
	}

	}

	

}
