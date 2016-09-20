/**
 * 
 */
package com.tijana.java7.interfaces;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * http://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html you can
 * keep static methods specific to an interface in the same interface rather
 * than in a separate class.
 * 
 * @author author
 *
 *         When you extend an interface that contains a default method, you can
 *         do the following:
 *         <ul>
 *         <li>Not mention the default method at all, which lets your extended
 *         interface inherit the default method.</li>
 *         <li>Redeclare the default method, which makes it abstract.</li>
 *         <li>Redefine the default method, which overrides it.</li>
 *         </ul>
 * 
 *         Multiple inheritance of implementation is the ability to inherit
 *         method definitions from multiple classes. Problems arise with this
 *         type of multiple inheritance, such as name conflicts and ambiguity.
 *         When compilers of programming languages that support this type of
 *         multiple inheritance encounter superclasses that contain methods with
 *         the same name, they sometimes cannot determine which member or method
 *         to access or invoke. In addition, a programmer can unwittingly
 *         introduce a name conflict by adding a new method to a superclass.
 *         Default methods introduce one form of multiple inheritance of
 *         implementation. A class can implement more than one interface, which
 *         can contain default methods that have the same name. The Java
 *         compiler provides some rules to determine which default method a
 *         particular class uses.
 */
public interface TimeClient {

	int SHINE = 31;
	static public final int SHINE31 = 31;

	void setTime(int hour, int minute, int second);

	void setDate(int day, int month, int year);

	void setDateAndTime(int day, int month, int year, int hour, int minute, int second);

	LocalDateTime getLocalDateTime();

	// ZonedDateTime getZonedDateTime(String zoneString);
	static ZoneId getZoneId(String zoneString) {
		try {
			return ZoneId.of(zoneString);
		} catch (DateTimeException e) {
			System.err.println("Invalid time zone: " + zoneString + "; using default time zone instead.");
			return ZoneId.systemDefault();
		}
	}

	// All method declarations in an interface, including default methods, are
	// implicitly public, so you can omit the public modifier.
	default ZonedDateTime getZonedDateTime(String zoneString) {
		return ZonedDateTime.of(getLocalDateTime(), getZoneId(zoneString));
	}

}
