/**
 * 
 */
package com.tijana.java7.generics.one;

/**
 * @author ttinana
 * 
 *         Generics operate only on Objects
 * 
 *         Not on primitive types
 *         
 *         Type Parameters Can’t Be Instantiated: ob = new T(); // Illegal!!!
 *         
 *         No static member can use a type parameter declared by the enclosing class
 *         static T ob; // WRONG
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a reference for integers
		Gen<Integer> iOb;

		// Create a Gen<Integer> object and assign its
		// reference to iOb. Notice the use of autoboxing
		// to encapsulate the value 88 within an Integer object.
		iOb = new Gen<Integer>(88);
		// show the tzpe
		iOb.showType();

		// Get the value in iOb.
		// Notice that no cast is needed.
		int v = iOb.getOb();
		System.out.println("value: " + v);

		System.out.println();

		// Create a Gen object for Strings.
		Gen<String> strOb = new Gen<String>("Generics Test");

		strOb.showType();
		// during compile time it knows the types
		// compiler: Type mismatch: cannot convert from Gen<String> to
		// Gen<Integer>
		// iOb=strOb;

		// this is compile error
		// int s = strOb.getOb();

		// No casting needed
		String s = strOb.getOb();
		System.out.println("value: " + s);
		/**
		 * Gen2
		 */
		Gen2<String, String> strOb2 = new Gen2<String, String>("myKey", "myvalue");
		System.out.println("Type K is: " + strOb2.getKey().getClass().getName());
		System.out.println("Type V is: " + strOb2.getValue().getClass().getName());
		System.out.println(strOb2.getClass().getName());

	}

}
