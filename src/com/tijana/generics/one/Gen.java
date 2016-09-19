package com.tijana.generics.one;

/**
 * 
 * @author ttinana
 *
 * @param <T>
 *            Here T is name of Type parameter. Gen is generic class
 * 
 *            it is used as aplaceholder for the actual type
 */
public class Gen<T> {

	T ob;

	public Gen() {
		super();
	}

	public Gen(T ob) {
		super();
		this.ob = ob;
	}

	/**
	 * @return the ob
	 */
	public T getOb() {
		return ob;
	}

	/**
	 * @param ob
	 *            the ob to set
	 */
	public void setOb(T ob) {
		this.ob = ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}

}
