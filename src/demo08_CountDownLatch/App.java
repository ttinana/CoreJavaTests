/**
 * 
 */
package demo08_CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author tijana.pavicic
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CountDownLatch latches = new CountDownLatch(3);
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=0; i<3; i++){
			executor.submit(new Processor(latches));
			
		}
		try {
			latches.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("completed");

	}

}
