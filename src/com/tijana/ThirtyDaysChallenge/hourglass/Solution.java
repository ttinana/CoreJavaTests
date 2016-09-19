/**
 * 
 */
package com.tijana.ThirtyDaysChallenge.hourglass;

import java.util.Scanner;

/**
 * @author ttinana
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int dim = 6;
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[dim][dim];

		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < dim; j++) {
				if (arr[i][j] >= -9 && arr[i][j] <= 9) {
					arr[i][j] = in.nextInt();
				} else {
					arr[i][j] = 0;
				}
			}
		}
		in.close();

		int max = -63;
		for (int i = 0; i < dim - 2; i++) {
			for (int j = 0; j < dim - 2; j++) {

				int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];

				if (sum >= max) {
					max = sum;
				}

			}

		}
		System.out.println(max);
	}
}
