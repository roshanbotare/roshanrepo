package com.roshan.mobileshop;

import com.roshan.consumer.MobileConsumer;
import com.roshan.factory.MobileFactory;
import com.roshan.producer.MobileProducer;

public class MobileShop {

	public static void main(String[] args) {

		MobileFactory mobileFactory=new MobileFactory();
		
		MobileProducer mobileProducer=new MobileProducer(mobileFactory);
		MobileConsumer mobileConsumer=new MobileConsumer(mobileFactory);
		
		
		Thread  producerThread=new Thread(mobileProducer);
		Thread  consumerThred=new Thread(mobileConsumer);
		
		
		consumerThred.start();
		producerThread.start();

	}

}
