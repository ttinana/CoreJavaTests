package com.tijana.java7.generics.one.boundedWildcards;

public class Coords<T extends TwoD> {

	private T[] coords;

	public Coords(T[] o) {
		coords = o;
	}
	// just wildcard
	static void showXY(Coords<?> c) {
		System.out.println("X Y Coordinates:");
		for (int i = 0; i < c.coords.length; i++)
			System.out.println(c.coords[i].x + " " + c.coords[i].y);
		System.out.println();
	}
	// bounded wildcard
	// because not all T have third coordinate
	static void showXYZ(Coords<? extends ThreeD> c) {
		System.out.println("X Y Z Coordinates:");
		for(int i=0; i < c.coords.length; i++)
		System.out.println(c.coords[i].x + " " +
		c.coords[i].y + " " +
		c.coords[i].z);
		System.out.println();
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
