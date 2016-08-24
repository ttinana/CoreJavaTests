package demo07_ExecutorService;

public class Processor implements Runnable {
	private int id;

	public Processor(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("started: " + id);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println("completed: " + id);

	}

}
