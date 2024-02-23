package com.roshan.producer;

import com.roshan.factory.MobileFactory;

public class MobileProducer implements Runnable {

	private MobileFactory mobileFactory;
	
	public MobileProducer(MobileFactory mobileFactory) {
		super();
		this.mobileFactory = mobileFactory;
	}
	
	@Override
	public void run() {

		for (int i = 1; i <=10; i++) {
			mobileFactory.produce(i);
		}
	}

}
