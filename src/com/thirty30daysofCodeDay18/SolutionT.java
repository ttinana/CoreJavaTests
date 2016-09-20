package com.thirty30daysofCodeDay18;

import java.util.Scanner;

public class SolutionT {
    
    char[] word;    

    public char[] getWord() {
        return word;
    }

    public void setWord(char[] word) {
        this.word = word;
    }

    // method that pushes a character onto a stack
    void pushCharacter(char ch) {
	this.getWord()[this.getWord().length] = ch;	
    }
    
 // method that pops and returns the character at the top of the instance
    // variable
    char popCharacter() {
	char[] stackPoped = new char[this.getWord().length-1];
	for(int i =1; i< stackPoped.length;i++){
	    stackPoped[i]= this.getWord()[i+1];
	}
	word=stackPoped;
	return stackPoped[this.getWord().length-2];
	
    }

    // method that enqueues a character in the instance variable
    void enqueueCharacter(char ch) {
	char[] enqueue = new char[this.getWord().length +1];
	enqueue[0]=ch;
	for(int i =1; i< enqueue.length;i++){
	    enqueue[i]= this.getWord()[i-1];
	}
    }

    
    
    // method that dequeues and returns the first character in the instance variable
    char dequeueCharacter() {
	char[] dequeue = new char[this.getWord().length-1];
	
	for(int i =1; i< dequeue.length;i++){
	    dequeue[i]= this.getWord()[i+1];
	}
	return dequeue[0];
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	scan.close();

	// Convert input String to an array of characters:
	char[] s = input.toCharArray();

	// Create a SolutionT object:
	SolutionT p = new SolutionT();

	// Enqueue/Push all chars to their respective data structures:
	for (char c : s) {
	    p.pushCharacter(c);
	    p.enqueueCharacter(c);
	}

	// Pop/Dequeue the chars at the head of both data structures and compare
	// them:
	boolean isPalindrome = true;
	for (int i = 0; i < s.length / 2; i++) {
	    if (p.popCharacter() != p.dequeueCharacter()) {
		isPalindrome = false;
		break;
	    }
	}

	// Finally, print whether string s is palindrome or not.
	System.out.println("The word, " + input + ", is "
		+ ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}


