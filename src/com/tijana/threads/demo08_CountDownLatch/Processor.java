package com.tijana.threads.demo08_CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Processor implements Runnable {
	private CountDownLatch latch;
	
	public Processor(CountDownLatch latch){
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("started");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// there is no need to use synchronized keyword since this is thread safe class
		latch.countDown();

	}

}
