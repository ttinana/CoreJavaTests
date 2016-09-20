/**
 * 
 */
package com.test.java8.l02.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author ttinana
 * 
 * Lightweight Strategy
 *
 */
public class Lambda01 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(totalValues(values, e -> true));
		System.out.println(totalValues(values, e -> e % 2 == 0));
		// normal function
		// higher order function

	}

	public static int totalValues(List<Integer> values, Predicate<Integer> selector) {
		/*
		 * int res = 0;
		 * 
		 * for (int e : values) { if (selector.test(e)) { res += e; } } return
		 * res;
		 */
		return values.stream().filter(selector).reduce(0, Integer::sum);
	}

	static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

}
