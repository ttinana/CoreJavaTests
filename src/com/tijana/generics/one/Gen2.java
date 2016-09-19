/**
 * 
 */
package com.tijana.generics.one;

/**
 * @author ttinana
 *
 */
public class Gen2<K, V> {
	K key;
	V value;
	public Gen2() {
		
	}
	public Gen2(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	/**
	 * @return the key
	 */
	public K getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(K key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public V getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(V value) {
		this.value = value;
	}
	 void showType(){
		 System.out.println("Type K is: " + key.getClass().getName());
		 System.out.println("Type V is: " + value.getClass().getName());
	 }
	

}
