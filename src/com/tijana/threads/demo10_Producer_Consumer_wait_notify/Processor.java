package com.tijana.threads.demo10_Producer_Consumer_wait_notify;

public class Processor {

	void produce() throws InterruptedException {
		synchronized(this){
			System.out.println("Produce running");
			wait();
		}

	}

	void consume() throws InterruptedException {
	}

}
