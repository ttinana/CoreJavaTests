/**
 * 
 */
package com.tijana.java7.generics.one.GenericInterfaces;

/**
 * @author ttinana
 *
 */
public interface MinMax<T extends Comparable<T>> {
	T min();
	T max();

}
