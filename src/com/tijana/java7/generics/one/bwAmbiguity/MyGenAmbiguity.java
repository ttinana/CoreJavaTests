package com.tijana.java7.generics.one.bwAmbiguity;

public class MyGenAmbiguity<K, V> {
	K k;
	V v;

	public MyGenAmbiguity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * fundamental problem is that the type erasure of set( ) reduces both
	 * versions to the following: 
	 * 
	 * void set(Object o) { // ...
	 */

	/**
	 * @param k
	 *            the k to set
	 */
	public void setK(K k) {
		this.k = k;
	}

	/**
	 * @param v
	 *            the v to set
	 */
	public void setV(V v) {
		this.v = v;
	}

}
