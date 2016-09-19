/**
 * 
 */
package com.tijana.inheritance;

/**
 * @author ttinana
 * 
 *         Multiple inheritance of implementation is the ability to inherit
 *         method definitions from multiple classes. Problems arise with this
 *         type of multiple inheritance, such as name conflicts and ambiguity.
 *         When compilers of programming languages that support this type of
 *         multiple inheritance encounter superclasses that contain methods with
 *         the same name, they sometimes cannot determine which member or method
 *         to access or invoke. In addition, a programmer can unwittingly
 *         introduce a name conflict by adding a new method to a superclass.
 *         Default methods introduce one form of multiple inheritance of
 *         implementation. A class can implement more than one interface, which
 *         can contain default methods that have the same name. The Java
 *         compiler provides some rules to determine which default method a
 *         particular class uses.
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// implicit casting
		Object obj = new MountainBike();
		// MountainBike myBike = obj;
		// we would get a compile-time error because obj is not known to the
		// compiler to be a MountainBike. However, we can tell the compiler that
		// we promise to assign a MountainBike to obj by explicit casting:
		// explicit casting
		MountainBike myBikeO = (MountainBike) obj;
		// to avoid runtime error we can use
		if (obj instanceof MountainBike) {
			MountainBike myBikeIns = (MountainBike) obj;
		}
		// it does not know about methods MountainBike
		Object myIBike = new MountainBike();
		// myIBike.test();

	}

}
