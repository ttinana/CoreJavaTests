/**
 * 
 */
package com.thirty30daysofCodeDay12;

//import java.awt.print.Book;
import java.util.Scanner;

/**
 * @author tijana.pavicic
 *
 */
public class Solution {

    /**
     * @param args
     */
    public static void main(String []args)
    {
       Scanner sc=new Scanner(System.in);
       String title=sc.nextLine();
       String author=sc.nextLine();
       int price=sc.nextInt();
       
       Book new_novel= new MyBook(title,author,price);
       new_novel.display();
       
    }

}
