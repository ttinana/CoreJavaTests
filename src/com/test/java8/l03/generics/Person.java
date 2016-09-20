package com.test.java8.l03.generics;

/**
 * Intersection Types
 */
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Person {

	public static void main(String[] args) throws IOException {
		System.out.println("Java version: " + System.getProperty("java.version"));
		System.out.println("");

		RandomAccessFile input = new RandomAccessFile("src\\main\\resorces\\person.txt", "rw");
		Person person2 = read(input);
		//System.out.println(person2.toString());

		DataInputStream stream = new DataInputStream(new FileInputStream("src\\main\\resorces\\person.txt"));
		Person person = read(stream);
		System.out.println(person.toString());

	}

	private static <I extends  DataInput & Closeable> Person read(I source) {
		try (I input = source) {
			return new Person(input.readLine(), Integer.valueOf(input.readLine()));
			// return new Person(input.readUTF(), input.readInt());

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

	}

	private static Person read(RandomAccessFile source) {
		try (RandomAccessFile input = source) {
			return new Person(input.readLine(), Integer.valueOf(input.readLine()));
			// return new Person(input.readUTF(), input.readInt());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	private final String name;
	private final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
