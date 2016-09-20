package com.thirty30daysofCodeDay18;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static List<Character> stack  = new ArrayList<Character>();
    static List<Character> queque = new ArrayList<Character>();

    void pushCharacter(char ch) {
	stack.add(ch);
    }

    char popCharacter() {
	if (stack != null && stack.size() > 0) {
	    char c = stack.get(stack.size() - 1);
	    stack.remove(stack.size() - 1);
	    return c;
	}
	return 0;
    }

    void enqueueCharacter(char ch) {
	queque.add(ch);
    }

    char dequeueCharacter() {
	char temp = queque.get(0);
	queque.remove(0);
	return temp;
    }

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String input = scan.nextLine();
	scan.close();

	// Convert input String to an array of characters:
	char[] s = input.toCharArray();

	// Create a SolutionT object:
	Solution p = new Solution();

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
