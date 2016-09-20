package com.thirty30daysofCodeDay11;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	// first line
	String firstName = scan.next();
	String lastName = scan.next();
	int id = scan.nextInt();
	// second line -length
	int numScores = scan.nextInt();
	// third line -array itself
	int[] testScores = new int[numScores];
	for(int i = 0; i < numScores; i++){
		testScores[i] = scan.nextInt();
	}
	scan.close();
	
	Student s = new Student(firstName, lastName, id, testScores);
	s.printPerson();
	System.out.println("Grade: " + s.calculate() );
    }

}
