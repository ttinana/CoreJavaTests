package com.test.java8.l03.generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * 
 * @author https://www.youtube.com/watch?v=34oiEq9nD0M
 *
 */
class Fruit {
}

class Banana extends Fruit {
}

class Orange extends Fruit {
}

public class App {
	public static void useFruit(Fruit fruit) {
		System.out.println("I am: " + fruit.getClass());
	}

	public static void useFruitBasket(List<Fruit> fruits) {
		fruits.add(new Orange());
		for (Fruit e : fruits) {
			System.out.println(e.getClass());
		}
		System.out.println("I am: " + fruits.getClass());
	}

	public static <T> void copy(List<T> src, List<? super T> target) {
		for (T element : src) {
			target.add(element);
		}

	}
	
	public static <T> void copy2(List<? extends T> src, List<T> target) {
		for (T element : src) {
			target.add(element);
		}

	}

	public static void main(String[] args) {
		Banana banana = new Banana();
		Orange orange = new Orange();
		// useFruit(banana);

		// OK Banana extends Fruit
		List<Fruit> basketOfFruits = new ArrayList<Fruit>();
		basketOfFruits.add(banana);
		basketOfFruits.add(orange);
		useFruitBasket(basketOfFruits);
		// NOTE:
		// BUT List<Banana> does NOT extend List<Fruit>
		List<Banana> basketOfBanana = new ArrayList<Banana>();
		basketOfBanana.add(banana);
		// basketOfBanana.add(orange); // compile error
		// useFruitBasket(basketOfBanana); // compile error
		//////////////////////////////////////////////////
		List<Fruit> basketF1 = new ArrayList();
		basketF1.add(banana);
		basketF1.add(orange);

		List<Fruit> basketF2 = new ArrayList();
		copy(basketF1, basketF2);
		System.out.println(basketF2.size());
		// lets go a little further
		//////////////////////////////////////////////////
		List<Banana> basket1 = new ArrayList();
		basket1.add(banana);

		List<Fruit> basket2 = new ArrayList();
		//copy(basket1, basket2);
		copy2(basket1, basket2);
		// to make this work you have to add wildcard ? super
		System.out.println("Size of basket2 " + basket2.getClass()+" is: " +basket2.size());

	}

	<T, U extends Comparable<? super U>> Comparator<T> comparing(Function<? super T, ? extends U> keyExtractor) {
		Objects.requireNonNull(keyExtractor);
		return (Comparator<T> & Serializable) (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));

	}

}
