/**
 * 
 */
package com.test.java8.l02.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author tijana.pavicic
 *
 */
interface LambdaI {
    void helloWorld();
}

interface LambdaCountI {
    void printCount(int i);
}

/*
 * class LambdaC implements LambdaI {
 * 
 * @Override public void helloWorld() { System.out.println("hello world");
 * 
 * }
 * 
 * }
 */ // ..1

public class MyLambda {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// functional programming
	List<Integer> numbers = Arrays.asList(1, 2, 3);
	numbers.forEach(System.out::println);
	System.out.println(numbers.stream().map(s -> s*2));

	// Lambda lam = new LambdaC(); //..1

	LambdaI lam = new LambdaI() { // Anonymous Inner Class

	    @Override
	    public void helloWorld() {
		System.out.println("hello world: I am boilerCode Anonymous Inner Class with one method. ;)");

	    }
	};
	lam.helloWorld();

	LambdaI lambda = () -> System.out.println(
		"hello world: I am elegant lambda. Check out .class files, there is no Inner class file for me.");
	lambda.helloWorld();

	// LambdaCountI lamCount = (int i) -> System.out.println(i);
	LambdaCountI lamCount = i -> System.out.println(i);
	lamCount.printCount(7);

    }

}
