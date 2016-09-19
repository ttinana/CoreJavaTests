/**
 * 
 */
package com.tijana.java7.collections.hashmap;

import java.io.IOException;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author tt
 *
 */
public class App {

	public static void main(String[] args) throws IOException {
		
		// mappsConcurrentHashMap();
		// mappsHashMap();
		// mappsHashMapToSYNC();

		//hashMapHashtableExample();
		System.out.println(ClassLoader.getSystemResources(null));
	}

	public static void hashMapHashtableExample() {
		Hashtable<String, String> hashtableobj = new Hashtable<String, String>();
		hashtableobj.put("Alive is ", "awesome");
		hashtableobj.put("Love", "yourself");
		System.out.println("Hashtable object output :" + hashtableobj);

		HashMap hashmapobj = new HashMap();
		hashmapobj.put("Alive is ", "awesome");
		hashmapobj.put("Love", "yourself");
		System.out.println("HashMap object output :" + hashmapobj);

	}

	/**
	 * ConcurrentHashMap synchronizes or locks on the BUCKET LEVEL
	 */
	public static void mappsConcurrentHashMap() {

		ConcurrentHashMap con = new ConcurrentHashMap();

		/**
		 * ConcurrentHashMap does NOT allow NULL keys NOR null VALUES
		 */
		con.put("one", "apple");
		con.put("two", "pear");
		// con.put(null, "pear");
		// con.put(null, null);
		// System.out.println("Hash map :" + con);

		Iterator<String> it = con.keySet().iterator();
		try {
			while (it.hasNext()) {
				System.out.println(it.next());
				con.put("three", "peach");
				con.remove("one");
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("Got Concurrent Modification Error");
		}
		System.out.println("Hash map :" + con);
	}

	public static void mappsHashMap() {

		Map<String, String> m = new HashMap<String, String>();
		m.put("one", "apple");
		m.put(null, "banana");
		m.put("two", "pear");
		// really really weird behaviour note
		System.out.println("Hash map :" + m);

		// Map can have a null key
		Iterator<String> it = m.keySet().iterator();
		try {
			while (it.hasNext()) {
				System.out.println(it.next() + " " + m.get(it.next()));
				m.put("three", "peach");
			}
		} catch (ConcurrentModificationException e) {
			System.out.println("Got Concurrent Modification Error");
		}
	}

	/**
	 * According to Oracle Docs, if the Hashtable is structurally modified at
	 * any time after the iterator is created in any way except the iterator's
	 * own remove method , then the iterator will throw ConcurrentModification
	 * Exception. Structural modification means adding or removing elements from
	 * the Collection object (here hashmap or hashtable) . Thus the enumerations
	 * returned by the Hashtable keys and elements methods are not fail fast.
	 */
	public static void mappsHashMapToSYNC() {

		Map<String, String> map = new HashMap<String, String>();

		// populate the map
		map.put("1", "ALIVE ");
		map.put("2", "IS");
		map.put("3", "AWESOME");
		map.put(null, "AWESOME");
		map.put(null, null);
		map.put(null, "tijana");
		map.put("1", "goran ");

		// create a synchronized map
		Map<String, String> syncMap = Collections.synchronizedMap(map);

		System.out.println("Synchronized map :" + syncMap);

	}

}
