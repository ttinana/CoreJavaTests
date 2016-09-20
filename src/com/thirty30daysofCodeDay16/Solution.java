package com.thirty30daysofCodeDay16;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int num = in.nextInt();

	for (int i = 0; i < num; i++) {
	    String n = in.next();
	    String p = in.next();
	    Integer valueN = -1;
	    Integer valueP = -1;

	    try {
		valueN = Integer.parseInt(n);
		System.out.println(n);
		valueP = Integer.parseInt(p);
		System.out.println(p);
	    } catch (NumberFormatException e) {
		e.printStackTrace();
		System.out.println("Bad string");
	    }

	    try {
		if (valueN >= 0 && valueP >= 0) {
		    BigInteger pow = power(valueN, valueP);
		    System.out.println(pow);

		} else {
		    throw new NonNegativeException("n and p should be non-negative");
		}
	    } catch (NonNegativeException ex) {
		ex.printStackTrace();
	    }

	}

    }

    static BigInteger power(int n, int p) {
	BigInteger pow = new BigInteger("1");
	for (int j = 0; j < p; j++) {
	    pow = pow.multiply(new BigInteger("n"));

	}
	return pow;
    }

}
