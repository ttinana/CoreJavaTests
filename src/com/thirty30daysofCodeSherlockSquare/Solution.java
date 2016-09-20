/**
 * 
 */
package com.thirty30daysofCodeSherlockSquare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author tijana.pavicic
 *
 */
public class Solution {

    /**
     * @param args
     */
    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	if (n > 0 && n <= 100) {
	    List<Integer> counters = new ArrayList<Integer>();
	    for (int io = 0; io < n; io++) {
		// citam granice
		int lower = in.nextInt();
		int upper = in.nextInt();
		// proveravam da li su u intervalu
		if (lower > 0 && upper > 0 && lower <= 1000000000 && upper <= 1000000000) {
		    // za svaki interval brojac postavim na nulu
		    int counter = 0;
		    for (int i =(int) Math.sqrt(lower); i <= (int) Math.sqrt(upper) +1; i++) {
			// ukoliko je broj iz intervala kvadrat i nije jedinica brojac uvecam za 1 
			if (i * i >= lower && i * i <= upper ) {
			    counter = counter + 1;
			}

		    }
		    counters.add(counter);
		}

	    }
	    for (Integer j : counters) {
		System.out.println(j);
	    }

	}
    }

}
