package com.tijana.java7.interfaces;

import java.time.ZonedDateTime;

/**
 * Any class that implements the interface AbstractZoneTimeClient will have to
 * implement the method getZonedDateTime; this method is an abstract method like
 * all other nondefault (and nonstatic) methods in an interface.
 * 
 * @author ttinana
 *
 */

public interface AbstractZoneTimeClient extends TimeClient {

	public ZonedDateTime getZonedDateTime(String zoneString);
}
