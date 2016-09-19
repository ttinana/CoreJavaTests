package com.tijana.generics.one.GenericSuperclass;

/**
 * 
 * @author ttinana
 *
 *         It is perfectly acceptable for a non-generic class to be the
 *         superclass of a generic subclass.
 */
public class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	// Return ob.
	T getob() {
		return ob;
	}
}

// A subclass of Gen.
class Gen2<T> extends Gen<T> {
	Gen2(T o) {
		super(o);
	}

	/**
	 * 
	 * 
	 */
	// A non-generic class can be the superclass
	// of a generic subclass.
	// A non-generic class.
	class NonGen {
		int num;

		NonGen(int i) {
			num = i;
		}

		int getnum() {
			return num;
		}
	}

	// A generic subclass.
	class Gen<T> extends NonGen {
		T ob; // declare an object of type T
		// Pass the constructor a reference to
		// an object of type T.

		Gen(T o, int i) {
			super(i);
			ob = o;
		}

		// Return ob.
		T getob() {
			return ob;
		}
	}

}
