/**
 * 
 */
package com.test.java8.l03.generics;

class A { /* ... */ }
interface B { /* ... */ }
interface C { /* ... */ }

class D <T extends A & B & C> { /* ... */ }

//If bound A is not specified first, you get a compile-time error:

//class F <T extends B & A & C> { /* ... */ }  // compile-time error

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}
