/**
 * 
 */
package com.tijana.java7.casting;

import java.util.ArrayList;

/**
 * @author tijana.pavicic
 *
 */
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
	
	double a=0.1f;

	double b=0.3f;
	

	System.out.println (a);

	System.out.println (b);
	
	System.out.println (3*a == b);
	
	
	/*A b = new B();
	B c = new C();
	b.test();
	//b.testB();// this does not work
	
	b.test();*/
	
	
	//super.test();
	//C m=(C)b;

	/*ArrayList names = new ArrayList();
	names.add("abcd"); // adding String
	names.add(1); // adding Integer

	String name = (String) names.get(0); // OK
	
	 * throw ClassCastException because you can not convert Integer to
	 * String
	 
	name = (String) names.get(1);*/

    }

}
