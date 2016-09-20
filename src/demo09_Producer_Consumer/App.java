package demo09_Producer_Consumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) throws InterruptedException {
	Thread t1 = new Thread(new Runnable() {

	    @Override
	    public void run() {
		try {
		    producer();
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}

	    }
	});

	Thread t2 = new Thread(new Runnable() {

	    @Override
	    public void run() {
		try {
		    consumer();
		} catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();

		}

	    }
	});

	Thread t = new Thread(() -> System.out.println("Hello world two!"));
	// Thread t_ = new Thread(System.out::println("Hello world two!"));

	new Thread(() -> {
	    System.out.println("Hello lambda expression with method that throws an exception!");
	    // lambda expression with method that throws an exception
	    try {
		System.out.println("Hello lambda expression with method that throws an exception in try block 1!");
		consumer();
		System.out.println("Hello lambda expression with method that throws an exception in try block 2!");
	    } catch (Exception e) {

	    }
	}).start();
	;

	new Thread(
		// lambda expression for the run method with a block statement
		() -> {
		    methodOne();
		    methodTwo();
		}).start();

	t1.start();
	t2.start();

	t1.join();
	t2.join();

    }

    private static void producer() throws InterruptedException {

	Random random = new Random();
	while (true) {

	    queue.put(random.nextInt(100));

	}
    }

    private static void consumer() throws InterruptedException {

	Random random = new Random();
	while (true) {
	    Thread.sleep(100);

	    if (random.nextInt(10) == 0) {

		Integer value = queue.take();

		System.out.println("Value: " + value + "Queue size: " + queue.size());

	    }
	}
    }

    private static void methodOne() {
	System.out.println("method one");
    }

    private static void methodTwo() {
	System.out.println("method two");
    }

}
