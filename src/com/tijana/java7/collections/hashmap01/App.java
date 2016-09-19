package com.tijana.java7.collections.hashmap01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, User> hashMap = new HashMap<String, User>();
		User u1 = new User(1, "tijana", "atijana", "tijana");
		User u2 = new User(2, "goran", "bgoran", "goran");
		User u3 = new User(3, "stenac", "cstenac", "stenac");
		hashMap.put(u1.getUserName(), u1);
		hashMap.put(u2.getUserName(), u2);
		hashMap.put(u3.getUserName(), u3);

		// printMap(hashMap); // print unsorted map

		// sorting map using TreeMap by key (userName)
		Map<String, User> sortedMap = new TreeMap<>();
		sortedMap.putAll(hashMap);
		// printMap(sortedMap); // print sorted by keys

		// sorting map using Guava by key (userName)
		Map<String, User> guavaSortedMap = Maps.newTreeMap(Ordering.natural());
		guavaSortedMap.putAll(hashMap);
		printMap(guavaSortedMap);

	}

	public static <K extends Comparable, V extends Comparable> Map<K, V> sortByKeys(Map<K, V> map) {
		List<K> keys = new LinkedList<K>(map.keySet());
		Collections.sort(keys);
		return map;

	}

	public static void printMap(Map<String, User> map) {
		// foreach key
		System.out.println("***   for loop   ***");
		for (String key : map.keySet()) {
			System.out.println(map.get(key).toString());
		}
		// keyset iterator
		System.out.println("***   keyset iterator   ***");
		Set<String> keySet = map.keySet();
		Iterator<String> keySetIterator = keySet.iterator();
		while (keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			System.out.println(map.get(key).toString());
		}
		// over values
		System.out.println("***   over values   ***");
		for (User user : map.values()) {
			System.out.println(map.get(user.getUserName()).toString());
		}

		// entry iterator
		System.out.println("***   entryset iterator   ***");
		Set<Map.Entry<String, User>> entrySet = map.entrySet();
		for (Entry e : entrySet) {
			System.out.println(e.getValue().toString());
		}

	}

}
