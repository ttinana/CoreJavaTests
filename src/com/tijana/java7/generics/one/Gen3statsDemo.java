package com.tijana.java7.generics.one;

public class Gen3statsDemo {
	public static void main(String args[]) {
		
		Integer inums[] = { 1, 2, 3, 4, 5 };
		Gen3stats<Integer> iob = new Gen3stats<Integer>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);
		
		Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Gen3stats<Double> dob = new Gen3stats<Double>(dnums);
		double w = dob.average();
		System.out.println("dob average is " + w);
		
		
		if(iob.sameAvg(dob))
		System.out.println("Averages are the same.");
		else
		System.out.println("Averages differ.");
		
		// This won't compile because String is not a
		// subclass of Number.
		// String strs[] = { "1", "2", "3", "4", "5" };
		// Stats<String> strob = new Stats<String>(strs);
		// double x = strob.average();
		// System.out.println("strob average is " + v);
	}

}
