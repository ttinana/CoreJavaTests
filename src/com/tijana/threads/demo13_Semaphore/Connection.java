package com.tijana.threads.demo13_Semaphore;

import java.util.concurrent.Semaphore;

public class Connection {
	private static Connection instance = new Connection();

	private Semaphore semaphore = new Semaphore(10, true);
	private int connections = 0;

	private Connection() {
	}

	public static Connection getInstance() {
		return instance;
	}

	public void connect() {
		try {

			// get permit decrease the semaphore value,
			// interesting that if it is 0 wait for release
			semaphore.acquire();
			doConnect();

		} catch (InterruptedException ignored) {
		} finally {
			// if doConnect throws and exception is still releases the permit
			// release permit, increase the semaphore value and activate waiting
			// thread[
			semaphore.release();
		}
	}

	public void doConnect() {
		synchronized (this) { // synchronization makes it atomic
			connections++;
			System.out.println("Current connections (MAX 10): " + connections);
		}
		try {
			// do your job
			System.out.println("Working on connections " + Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException ignored) {
		}
		// when exit doConnect method decrement number of connections
		synchronized (this) {// synchronization makes it atomic
			connections--;
			System.out.println("I'm done " + Thread.currentThread().getName()
					+ " Connection is released , connection count: " + connections);
		}
	}

}
