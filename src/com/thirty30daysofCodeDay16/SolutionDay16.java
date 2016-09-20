/**
 * 
 */
package com.thirty30daysofCodeDay16;

import java.util.Scanner;

/**
 * @author tijana.pavicic
 *
 */
public class SolutionDay16 {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String S = in.next();
	if(S.length()>=1 && S.length()<=6){
	try {
	    Integer value = Integer.parseInt(S);
	    System.out.println(value);
	} catch (NumberFormatException e) {
	    System.out.println("Bad string");
	}
	}

    }

}
