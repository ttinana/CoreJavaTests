/**
 * 
 */
package com.thirty30daysofCodeDay12;

/**
 * @author tijana.pavicic
 *
 */
abstract class Book {

    String title;
    String author;

    Book(String t, String a) {
	title = t;
	author = a;
    }

    abstract void display();

}

class MyBook extends Book {

    int price;

    public MyBook(String t, String a, int price) {
	super(t, a);
	this.price = price;
    }
    
    

    public int getPrice() {
        return price;
    }

    @Override
    void display() {
	System.out.println("Title: " + this.title);
	System.out.println("Author: " + this.author);
	System.out.println("Price: " + this.getPrice());

    }

}
