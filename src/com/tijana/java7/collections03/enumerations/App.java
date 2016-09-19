package com.tijana.java7.collections03.enumerations;
/**
 * 
 * @author ttinana
 *
 *Java enumerations are class tzpes
 */
public class App {
	enum Apple {
		Golde, Green, Cortland
	};

	enum enum1 {
		A, B, C
	};

	public static void main(String[] args) {

		Apple ap;
		ap = Apple.valueOf("Green");
		System.out.println("green " + ap);
			
		// for each style loop
		Apple[] apples = Apple.values();
		for (Apple a : apples) {
			System.out.println(a);
		}

	}

}
