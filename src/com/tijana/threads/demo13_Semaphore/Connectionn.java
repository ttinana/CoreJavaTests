package com.tijana.threads.demo13_Semaphore;

import java.util.concurrent.Semaphore;

public class Connectionn {
	private static Connectionn instance = new Connectionn();

	private Semaphore semaphore = new Semaphore(10, true);

	private Connectionn() {
	}

	public static Connectionn getInstance() {
		return instance;
	}

	public void connect() {
		try {

			// get permit decrease the semaphore value, if 0 wait for release
			// because that is what aquire does
			semaphore.acquire();

			System.out.printf("%s:: Current connections (MAX 10): %d\n", Thread.currentThread().getName(),
					semaphore.availablePermits());

			System.out.printf("%s:: WORKING...\n", Thread.currentThread().getName());
			Thread.sleep(2000);

			System.out.printf("%s:: Connection released. Permits Left = %d\n", Thread.currentThread().getName(),
					semaphore.availablePermits());

		} catch (InterruptedException ignored) {
		} finally {
			// release permit, increase the semaphore value and activate waiting
			// thread
			semaphore.release();
		}
	}

}
