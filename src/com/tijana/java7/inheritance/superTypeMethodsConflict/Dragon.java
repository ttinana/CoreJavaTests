package com.tijana.java7.inheritance.superTypeMethodsConflict;

/**
 * If two or more independently defined default methods conflict, or a default
 * method conflicts with an abstract method, then the Java compiler produces a
 * compiler error. You must explicitly override the supertype methods.
 * 
 * @author ttinana
 *
 *
 *         Note: Static methods in interfaces are never inherited.
 */
public class Dragon implements EggLayer, FireBreather {

	// if we override this method there is no
	// compiletime error
	public String identifyMyself() {
		/**
		 * The name preceding super (in this example, FireBreather) must refer
		 * to a direct superinterface that defines or inherits a default for the
		 * invoked method, it can not be uperr level
		 */
		return FireBreather.super.identifyMyself();

	}

	public static void main(String... args) {
		Dragon myApp = new Dragon();
		System.out.println(myApp.identifyMyself());
	}
}