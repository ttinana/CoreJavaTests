/**
 * 
 */
package com.tijana.java7.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author ttinana
 *
 */
public class SerializeDemo {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Tijana Pavicic";
		e.address = "Novogradska 44";
		e.SSN = 11122333;
		e.number = 1011;

		try {
			FileOutputStream fileOut = new FileOutputStream("F:\\a\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in F:\\a\\employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

}
