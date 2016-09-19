package com.tijana.ThirtyDaysChallenge;

public class A implements Cloneable{
	String a;
	B b;

	public A() {
		B b = new B("beeee");
	}

	public A(String a) {
		B b = new B("beeee");
		this.a = a;
	}

	public A(String a, B b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * @return the a
	 */
	public String getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(String a) {
		this.a = a;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	/**
	 * @return the b
	 */
	public B getBee() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(B b) {
		this.b = b;
	}
	
	

}
