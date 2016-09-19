/**
 * 
 */
package com.tijana.generics.one;

import java.io.Serializable;

/**
 * @author ttinana
 * 
 *         UPPER BOUND
 * 
 *         from which all type arguments must be derived
 *
 */
public class Gen3stats<T extends Number & Serializable> {


	T[] nums; // array of Number or subclass

	// Pass the constructor a reference to
	// an array of type Number or subclass.
	Gen3stats(T[] o) {
		nums = o;
	}

	// Return type double in all cases.
	double average() {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		return sum / nums.length;
	}
	
	// *** WILDCARDS ***
	boolean sameAvg(Gen3stats<?> ob) {
		if(average() == ob.average())
		return true;
		return false;
		}

}
