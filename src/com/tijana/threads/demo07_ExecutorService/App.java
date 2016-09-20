package com.tijana.threads.demo07_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class App {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2); 
		
		for(int i =0; i<5; i++){
			
			executor.submit(new Processor(i));
		}
		executor.shutdown();
		System.out.println("all taskas submited");
		
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("all taskas completed");
		

	}

}
