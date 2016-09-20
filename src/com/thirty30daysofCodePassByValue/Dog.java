package com.thirty30daysofCodePassByValue;

public class Dog {
    String name;

    public Dog() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Dog(String name) {
	super();
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public void foo(Dog d) {
	d = new Dog("Fifi"); // creating the "Fifi" dog
    }

    public void fooo(Dog d) {
	d.setName("Fifi");
    }

    public void foooo(Dog someDog) {
	/**
	 * someDog is followed to the Dog it points to (the Dog object at
	 * address 42) that Dog (the one at address 42) is asked to change his
	 * name to Max
	 */
	someDog.setName("Max");
	someDog.bark();
	/**
	 * a new Dog is created. Let's say he's at address 74 we assign the
	 * parameter someDog to 74
	 */
	someDog = new Dog("Fifi");
	someDog.bark();
	/**
	 * someDog is followed to the Dog it points to (the Dog object at
	 * address 74) that Dog (the one at address 74) is asked to change his
	 * name to Rowlf then, we return
	 */
	someDog.setName("Rowlf");
	someDog.bark();
    }
    
    

    public void bark() {
	System.out.println("my name is: " + this.getName());
    }
    
    public static void main(String[] args) {
	Dog aDog = new Dog("Rover"); // creating the "Max" dog
	// at this point, aDog points to the "Max" dog
	//aDog.foo(aDog); // aDog still points to the "Max" dog
	
	
	
	
	
	aDog.foooo(aDog);
	aDog.bark();

    }

}
