package org.days30DaysOfChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
	 
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
	            System.out.print( arr[n-i+1] );
	        }
	        //System.out.print( arr[n-i+1] );
	        in.close();
	
	

    }
    public static void day6(){
	Scanner scanner = new Scanner(System.in);
	Integer counter = scanner.nextInt();
	scanner.nextLine();
	for (int i = 0; i < counter; i++) {
	    
	    String newLine = scanner.nextLine();
	    char[] charNewLine = newLine.toCharArray();
	    /* ................odd...........................*/
	    String odd = "";
	    for (int j = 0; j < charNewLine.length; j = j + 2) {
		odd = odd + charNewLine[j];
	    }
	    /* ................even...........................*/
	    String even = "";
	    for (int k = 1; k < charNewLine.length; k = k + 2) {
		even = even + charNewLine[k];
	    }
	    System.out.println(odd + " " + even);

	}
	scanner.close();
    }

    public static void test() {
	Scanner scan = new Scanner(System.in);

	// Read a full line of input from stdin and save it to our variable,
	// inputString.
	String inputString = scan.nextLine();

	// Close the scanner object, because we've finished reading
	// all of the input from stdin needed for this challenge.
	scan.close();

	// Print a string literal saying "Hello, World." to stdout.
	System.out.println("Hello, World.");
    }

    public static final long toLong(byte[] byteArray, int offset, int len) {
	long val = 0;
	len = Math.min(len, 8);
	for (int i = (len - 1); i >= 0; i--) {
	    val <<= 8;
	    val |= (byteArray[offset + i] & 0x00FF);
	}
	return val;
    }

}
