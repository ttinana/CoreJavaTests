/**
 * 
 */
package com.tijana.volatileA.array;

/**
 * @author tijana.pavicic volatile variables provide the guarantee about
 *         ordering and visibility e.g. volatile assignment cannot be re-ordered
 *         with other statements but in the absence of any synchronization
 *         instruction compiler, JVM or JIT are free to reorder statements for
 *         better performance. volatile also provides the happens-before
 *         guarantee which ensure changes made in one thread is visible to
 *         others. In some cases volatile also provide atomicity e.g. reading
 *         64-bit data types like long and double are not atomic but read of
 *         volatile double or long is atomic.
 */
public class App {
    volatile static int[] arr = new int[10];

    /**
     * you can make an array volatile in Java but only the reference which is
     * pointing to an array, not the whole array. What I mean, if one thread
     * changes the reference variable to points to another array, that will
     * provide a volatile guarantee, but if multiple threads are changing
     * individual array elements they won't be having happens before guarantee
     * provided by the volatile modifier.
     */
    public static void main(String[] args) {

	arr = arr;
	int x = arr[0];
	arr[0] = 1;
    }
}
class Helper {
}
/**
 * 
 * @author tijana.pavicic
 * 
 *         The object of the double-checked locking pattern is to avoid
 *         synchronization when reading a lazily constructed singleton that is
 *         shared between threads. If you have already constructed the object,
 *         the helper field will not be null, so you won't have to perform the
 *         synchronization.
 *
 */
class Foo {
    private volatile Helper helper = null;

    public Helper getHelper() {
	if (helper == null) {
	    synchronized (this) {
		if (helper == null) {
		    helper = new Helper();
		}
	    }
	}
	return helper;
    }
}
