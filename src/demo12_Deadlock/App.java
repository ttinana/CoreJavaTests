/**
 * 
 */
package demo12_Deadlock;

/**
 * @author tijana.pavicic
 *
 */
public class App {

	/**
	 * @param args
	 */

	public static void main(String[] args) throws Exception {

		final ServiceAccount serviceAccount = new ServiceAccount();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					serviceAccount.firstThread();
				} catch (InterruptedException ignored) {
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					serviceAccount.secondThread();
				} catch (InterruptedException ignored) {
				}
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		serviceAccount.finished();
	}

}
