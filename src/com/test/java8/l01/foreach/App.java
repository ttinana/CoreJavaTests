/**
 * 
 */
package com.test.java8.l01.foreach;

import java.util.Arrays;
import java.util.List;

/**
 * @author tijana.pavicic
 *
 */
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
	List<Integer> myList = Arrays.asList(2, 3, 4, 5, 6);
	// external loop not part of the collections
	for (int i = 0; i < myList.size(); i++) {
	    System.out.println(myList.get(i));
	}
	// external loop not part of the collections
	for (Integer i : myList) {
	    System.out.println(i);
	}
	// internal loops, part of the collection therefore much faster
	myList.forEach(i -> System.out.println(i)); // lambda // consumer
	
	

    }

}
