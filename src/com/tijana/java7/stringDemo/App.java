package com.tijana.java7.stringDemo;

public class App {

	public static void main(String[] args) {
		/**
		 * If you look substring method inside String class, you will figure out
		 * that it calls String (int offset, int count, char value [])
		 * constructor to create new String object. What is interesting here is,
		 * value[], which is the same character array used to represent original
		 * string. So what's wrong with this?
		 * 
		 * In case If you have still not figured it out, If the original string
		 * is very long, and has array of size 1GB, no matter how small a
		 * substring is, it will hold 1GB array. This will also stop original
		 * string to be garbage collected, in case if doesn't have any live
		 * reference. This is clear case of memory leak in Java, where memory is
		 * retained even if it's not required. That's how substring method
		 * creates memory leak.
		 * 
		 */
		String o = new String("0123456789");
		System.out.println(o.substring(1, 9)); // od mesta 1 do mesta 9 [1,9]
		System.out.println(o.substring(10, 10)); // numerise od 0 ali ne baca
													// gresku

	}

}
