/**
 * 
 */
package com.tijana.java7.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author ttinana
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("tijana");
		set.add(new String("Goran"));
		set.add(new String("tijana"));// this is duplicate so it does not add

		// for loop
		System.out.println("***   for loop   ***");
		for (String s : set) {
			System.out.println(s);
		}
		// with Iterator
		System.out.println("***   iterator   ***");
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		// java8
		System.out.println("***   java8   ***");
		set.forEach(System.out::println);

		// lambda
		System.out.println("***   lambda   ***");
		set.forEach(s -> System.out.println(s));

	}

}
