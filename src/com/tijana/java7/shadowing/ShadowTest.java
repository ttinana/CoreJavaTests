/**
 * 
 */
package com.tijana.java7.shadowing;

/**
 * http://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
 * @author ttinana
 * 
 *         Serialization of inner classes, including local and anonymous
 *         classes, is strongly discouraged. When the Java compiler compiles
 *         certain constructs, such as inner classes, it creates synthetic
 *         constructs; these are classes, methods, fields, and other constructs
 *         that do not have a corresponding construct in the source code.
 *         Synthetic constructs enable Java compilers to implement new Java
 *         language features without changes to the JVM. However, synthetic
 *         constructs can vary among different Java compiler implementations,
 *         which means that .class files can vary among different
 *         implementations as well. Consequently, you may have compatibility
 *         issues if you serialize an inner class and then deserialize it with a
 *         different JRE implementation. See the section Implicit and Synthetic
 *         Parameters in the section Obtaining Names of Method Parameters for
 *         more information about the synthetic constructs generated when an
 *         inner class is compiled.
 *
 */
public class ShadowTest {

	/**
	 * @param args
	 */
	public int x = 0;

	class FirstLevel {

		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
		}
	}

	public static void main(String[] args) {
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}

}
