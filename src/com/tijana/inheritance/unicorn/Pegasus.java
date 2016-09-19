/**
 * 
 */
package com.tijana.inheritance.unicorn;

/**
 * @author ttinana
 *
 */
/**
 * 
 * Methods that are already overridden by other candidates are ignored. This
 * circumstance can arise when supertypes share a common ancestor.
 * RETURNS I am a horse.
 */
public class Pegasus extends Horse implements Flyer, Mythical {
	public static void main(String... args) {

		Pegasus myApp = new Pegasus();
		System.out.println(myApp.identifyMyself());
		
	}
}
/*
 * Default methods and abstract methods in interfaces are inherited like
 * instance methods. However, when the supertypes of a class or interface
 * provide multiple default methods with the same signature, the Java compiler
 * follows inheritance rules to resolve the name conflict. These rules are
 * driven by the following two principles:
 */
