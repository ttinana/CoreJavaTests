/**
 * 
 */
package com.tijana.serialization;

/**
 * @author ttinana
 *
 */
import java.io.*;

public class DeserializeDemo {
	public static void main(String[] args) {
		Employee e = null;
		try {
			FileInputStream fileIn = new FileInputStream("F:\\a\\employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserialized...");
		System.out.println("Name: " + e.name);
		System.out.println("Address: " + e.address);
		System.out.println("SSN: " + e.SSN);
		System.out.println("Number: " + e.number);
	}
}