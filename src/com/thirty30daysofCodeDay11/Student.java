package com.thirty30daysofCodeDay11;

public class Student extends Person {
    public enum Average {
	O, E, A, P, D, T
    }

    private int[]    testScores;
    
    public int[] getTestScores() {
        return testScores;
    }

    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }

    public Student(String firstName, String lastName, int id, int[] testScores) {
	super(firstName, lastName, id);
	this.testScores = testScores;
    }

   
    public char calculate(){
	char avg=0;
	int res=0;
	for(int i:this.getTestScores()){
	    res+=i;
	}
	int a = res/this.getTestScores().length;
	
	if (a>=90 && a<=100) {
	    avg='O';
	 } else if (a>=80 && a<=90) {
	     avg='E';
	 } else if ( a>=70 && a<=80) {
	     avg='A';
	 }
	 else if (a>=55 && a<=70 ) {
	     avg='P';
	 }
	 else if (a>=40 && a<=55 ) {
	     avg='D';
	 }else if (a>=0 && a<=40 ) {
	     avg='T';
	 }
	
	return avg;
	
    }

}
