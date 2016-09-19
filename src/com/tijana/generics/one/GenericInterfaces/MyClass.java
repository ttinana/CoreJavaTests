/**
 * 
 */
package com.tijana.generics.one.GenericInterfaces;

/**
 * @author ttinana
 *
 */
class MyClass<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;

	MyClass(T[] o) {
		vals = o;
	}

	// Return the minimum value in vals.
	public T min() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) < 0)
				v = vals[i];
		return v;
	}

	// Return the maximum value in vals.
	public T max() {
		T v = vals[0];
		for (int i = 1; i < vals.length; i++)
			if (vals[i].compareTo(v) > 0)
				v = vals[i];
		return v;
	}
}
