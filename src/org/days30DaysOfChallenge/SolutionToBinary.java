/**
 * 
 */
package org.days30DaysOfChallenge;

import java.util.Scanner;

/**
 * @author tijana.pavicic
 *
 */
public class SolutionToBinary {

    /**
     * @param args
     */
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if (n >= 1 && n <= 1000000) {
	    toBinary(n);
	}
    }

    public static int toBinary(int n) {

	String s = Integer.toBinaryString(n);
	// System.out.println(s.toCharArray());

	int max = 1;
	int br = 1;

	for (int i = 0; i < s.length() - 1; i++) {

	    if (s.charAt(i) == s.charAt(i + 1)) {
		br += 1;
		if (max <= br) {
		    max = br;
		}

	    } else {
		br = 1;
		continue;
	    }
	}
	System.out.println(max);
	return max;
    }

}
