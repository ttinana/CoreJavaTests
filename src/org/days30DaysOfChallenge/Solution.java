package org.days30DaysOfChallenge;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    public static void main(String[] argh) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	Map<String, Integer> phoneBook = new HashMap<String, Integer>();
	// adding elements to map
	for (int i = 0; i < n; i++) {
	    String name = in.next();
	    int phone = in.nextInt();
	    phoneBook.put(name, phone);
	}
	
	Set<String> keys = new HashSet<String>();
	while (in.hasNext()) {
	    String s = in.next();
	    keys.add(s);
	   
	}
	in.close();
	for (String s:keys){
	    System.out.println(s + "=" + phoneBook.get(s));
	}
	//keys.forEach(k ->System.out.println(k + "=" + phoneBook.get(k)));
	 
	    
	
    }    

}
