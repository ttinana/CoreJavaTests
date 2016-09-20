package com.tijana.threads.demo07_explain;

public class App {

	/**
	 * synchronized on fun1 and fun2 is synchronized on instance object level.
	 * synchronized on fun4 is synchronized on class object level. Which means:
	 * <ul>
	 * <li>When 2 threads call a1.fun1() at same time, latter call will be
	 * blocked.</li>
	 * <li>When thread 1 call a1.fun1() and thread 2 call a1.fun2() at same
	 * time, latter call will be blocked.</li>
	 * <li>When thread 1 call a1.fun1() and thread 2 call a1.fun3() at same
	 * time, no blocking, the 2 methods will be executed at same time.</li>
	 * <li>When thread 1 call A.fun4(), if other threads call A.fun4() or
	 * A.fun5() at same time, latter calls will be blocked since synchronized on
	 * fun4 is class level.</li>
	 * <li>When thread 1 call A.fun4(), thread 2 call a1.fun1() at same time, no
	 * blocking, the 2 methods will be executed at same time.</li>
	 * </ul>
	 * 
	 */
	public synchronized void fun1() {
	}

	public synchronized void fun2() {
	}

	public void fun3() {
	}

	public static synchronized void fun4() {
	}

	public static void fun5() {
	}

	public static void main(String[] args) {
		App a = new App();

	}

}
