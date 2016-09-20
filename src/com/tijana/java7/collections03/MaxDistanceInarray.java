/**
 * 
 */
package com.tijana.java7.collections03;

import java.util.Scanner;

/**
 * @author tijana.pavicic
 *
 */
public class MaxDistanceInarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int	  maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
	this.elements = elements;

    }

    public int maximumDifference(int[] elements) {

	int max = 0;

	for (int i = 0; i < elements.length - 1; i++) {

	    int p = 0;
	    for (int j = i + 1; j < elements.length; j++) {
		p = Math.abs(elements[i] - elements[j]);
		System.out.println("za i: " + i + "  imamo vrednosti: " + p);
		if (p >= max) {
		    max = p;
		}

	    }
	}

	return max;
    }

    public void computeDifference() {
	this.maximumDifference = maximumDifference(elements);

    }

}
