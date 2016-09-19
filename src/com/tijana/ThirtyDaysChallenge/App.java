package com.tijana.ThirtyDaysChallenge;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		B myB = new B("goran");
		B yourB= myB;
		myB.setB("Mr.Perfect");
		A ob = new A("tijana", myB);
		//System.out.println(ob.getA());
		
		try {
			A clone = (A) ob.clone();
			myB.setB("Mr.Perfect");
			System.out.println(clone.getA());
			System.out.println(clone.getBee().getB());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		

		//day3();
	}

	public static void day3() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n > 0 && n < 101) {
			if (n % 2 == 1) {
				ans = "Weird";
			} else {
				if (5 < n && n < 21) {
					ans = "Weird";
				}
			}
			if ((n % 2 == 0) && ((n > 1 && n < 6) || n > 20)) {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);
	}

	public static void day02() {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);
		/* Declare second integer, double, and String variables. */
		int i1 = 0;
		double d1 = 0.0;
		String s1;
		/* Read and save an integer, double, and String to your variables. */
		String inputString = scan.nextLine();
		try {
			i1 = Integer.parseInt(inputString);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		inputString = scan.nextLine();
		try {
			d1 = Double.parseDouble(inputString);
		} catch (NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		inputString = scan.nextLine();
		s1 = inputString;
		scan.close();
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + i1);

		/* Print the sum of the double variables on a new line. */
		BigDecimal sum = new BigDecimal(d).add(new BigDecimal(d1));
		double totalCostd = sum.doubleValue();
		System.out.println(totalCostd);
		/*
		 * Concatenate and print the String variables on a new line; the 's'
		 * variable above should be printed first.
		 */
		System.out.println(s + s1);
	}

	public static void day01() {
		// Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in);

		// Read a full line of input from stdin and save it to our variable,
		// inputString.
		String inputString = scan.nextLine();

		// Close the scanner object, because we've finished reading
		// all of the input from stdin needed for this challenge.
		scan.close();

		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");

		// TODO: Write a line of code here that prints the contents of
		// inputString to stdout.
		System.out.println(inputString);
	}

	public static void totalMEalCost() {
		Scanner scan = new Scanner(System.in);
		double mealCost = scan.nextDouble(); // original meal price
		int tipPercent = scan.nextInt(); // tip percentage
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		// Write your calculation code here.
		BigDecimal tip = new BigDecimal(mealCost).multiply(new BigDecimal(tipPercent)).divide(new BigDecimal(100));
		BigDecimal tax = new BigDecimal(mealCost).multiply(new BigDecimal(taxPercent)).divide(new BigDecimal(100));
		BigDecimal totalCostBD = new BigDecimal(mealCost).add(tip).add(tax);
		totalCostBD = totalCostBD.setScale(2, RoundingMode.HALF_UP);
		double totalCostd = totalCostBD.doubleValue();

		// cast the result of the rounding operation to an int and save it as
		// totalCost
		int totalCost = (int) Math.round(totalCostd);

		// Print your result
		System.out.println("The total meal cost is " + totalCost + " dollars.");

	}

}
