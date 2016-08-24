/**
 * 
 */
package demo12_Deadlock;

/**
 * @author tijana.pavicic
 *
 */
public class ProblemIlustrated {

	public static final Object lock1 = new Object();
	public static final Object lock2 = new Object();
	private int index;

	/**
	 * 
	 * @param a
	 */
	public static void main(String[] a) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		t1.start();
		t2.start();
	}

	/**
	 * Nested synchronized block which locks lock1 and then tries to lock lock2
	 * but it can not since thread 2 is holding it
	 * 
	 * @author tijana.pavicic
	 *
	 */
	private static class Thread1 extends Thread {

		public void run() {
			synchronized (lock1) {
				System.out.println("Thread 1: Holding lock 1...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException ignored) {
				}
				System.out.println("Thread 1: aquairing lock 2...");
				synchronized (lock2) {
					System.out.println("Thread 2: holding lock 1 & 2...");
				}
			}
		}
	}

	/**
	 * Nested synchronized block which locks lock2 and then tries to lock lock1
	 * but it can not since thread 1 is holding it
	 * 
	 * @author tijana.pavicic
	 *
	 */
	private static class Thread2 extends Thread {

		public void run() {
			synchronized (lock2) {
				System.out.println("Thread 2: holding lock 2...");
				try {
					Thread.sleep(10);
				} catch (InterruptedException ignored) {
				}
				System.out.println("Thread 2: aquairing lock 1...");
				synchronized (lock1) {
					System.out.println("Thread 2: holding lock 2 & 1...");
				}
			}
		}
	}
}
