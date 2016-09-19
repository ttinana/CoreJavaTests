/**
 * 
 */
package com.test.java8.l03.stat;

/**
 * @author tijana.pavicic
 *
 */
interface MyStaticInterfaceMethod {
    static void hi() {
	System.out.println("static inteface method");
    }

}

class App {
    public static void main(String[] args) {
	MyStaticInterfaceMethod.hi();
    }
}
