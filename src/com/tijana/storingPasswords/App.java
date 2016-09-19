/**
 * 
 */
package com.tijana.storingPasswords;

import org.apache.commons.codec.binary.Base64;

/**
 * @author ttinana
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * * Strings are immutable in Java so if you store password as plain
		 * text it will be available in memory until Garbage collector clears it
		 * and since String are used in String pool for reusability there is
		 * pretty high chance that it will be remain in memory for long
		 * duration, which pose a security threat. Since any one who has access
		 * to memory dump can find the password in clear text and that's another
		 * reason you should always used an encrypted password than plain text.
		 * 
		 * *if use Array you won't print contents of array instead its memory
		 * location get printed. though not a real reason but still make sense.
		 * 
		 * 
		 */
		String strPassword = "MyPassword";
		char[] charPassword = new char[] { 'M', 'y', 'P', 'a', 's', 's', 'w', 'o', 'r', 'd' };
		System.out.println("String password: " + strPassword);
		System.out.println("Character password: " + charPassword);
		
		/**
		 * base64 is NOT encryption. It is encoding.
		 */
		
		String orig = "original String before base64 encoding in Java";

        //encoding  byte array into base 64
        byte[] encoded = Base64.encodeBase64(orig.getBytes());     
      
        System.out.println("Original String: " + orig );
        System.out.println("Base64 Encoded String : " + new String(encoded));
      
        //decoding byte array into base64
        byte[] decoded = Base64.decodeBase64(encoded);      
        System.out.println("Base 64 Decoded  String : " + new String(decoded));


	}

}
