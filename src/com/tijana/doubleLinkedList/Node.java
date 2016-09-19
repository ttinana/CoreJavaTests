package com.tijana.doubleLinkedList;

import java.util.LinkedList;
/**
 * 
 * @author ttinana
 *
 */
public class Node {
	
	String item;
    Node next;
    Node prev;

    Node(Node prev, String element, Node next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
    
  

}
