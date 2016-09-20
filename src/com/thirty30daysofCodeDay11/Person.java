package com.thirty30daysofCodeDay11;

class Person {
    
   

    protected int    idNumber;
    protected String firstName;
    protected String lastName;

    public Person() {
    }

    public Person( String firstName, String lastName, int idNumber) {
	
	super();
	this.idNumber = idNumber;
	this.firstName = firstName;
	this.lastName = lastName;
    }
    
 // Print person data
 	public void printPerson(){
 		 System.out.println(
 				"Name: " + lastName + ", " + firstName 
 			+ 	"\nID: " + idNumber); 
 	}

}
