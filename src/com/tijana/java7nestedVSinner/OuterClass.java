/**
 * 
 */
package com.tijana.java7nestedVSinner;

/**
 * @author tijana.pavicic
 * 
 *         <h1>Nested classes are divided into two categories: static and
 *         non-static.</h1>
 *         <ul>
 *         <li><b>static nested classes</b> Nested classes that are declared
 *         static are simply called static nested classes.</li>
 *         <li><b>inner classes.</b> Non-static nested classes are called inner
 *         classes.</li>
 *         </ul>
 *         <br>
 * 
 *         <i>OR in more detailed manner</i>
 *         <h1>There are four kinds of nested class in Java. In brief, they are:
 *         </h1>
 *         <ul>
 *         <li><b>static class:</b> declared as a static member of another class
 *         </li>
 *         <li><b>inner class:</b> declared as an instance member of another
 *         class</li>
 *         <li><b>local inner class:</b> declared inside an instance method of
 *         another class</li>
 *         <li><b>anonymous inner class:</b> like a local inner class, but
 *         written as an expression which returns a one-off object</li>
 * 
 *         </ul>
 *         <h2>Static nested class would only have access to the static members
 *         of the outer class, and have no access to non-static members.</h2>
 *
 */
public class OuterClass {

	class InnerClass {

	}

	static class StaticNestedClass {

	}

	/**
	 * An instance of InnerClass can exist only within an instance of OuterClass
	 * and has direct access to the methods and fields of its enclosing
	 * instance.
	 * 
	 * To instantiate an inner class, you must first instantiate the outer
	 * class. Then, create the inner object within the outer object with this
	 * syntax:
	 * 
	 * Static nested classes are accessed using the enclosing class name:
	 */
	public static void main(String[] args) {
		/**
		 * An instance of InnerClass can exist only within an instance of
		 * OuterClass and has direct access to the methods and fields of its
		 * enclosing instance.
		 * 
		 * To instantiate an inner class, you must first instantiate the outer
		 * class. Then, create the inner object within the outer object with
		 * this syntax:
		 */
		OuterClass outerObject = new OuterClass();
		OuterClass.InnerClass innerObject = outerObject.new InnerClass();

		/**
		 * Static nested classes are accessed using the enclosing class name:
		 */
		OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();

	}

}
