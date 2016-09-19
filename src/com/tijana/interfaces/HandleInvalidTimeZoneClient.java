package com.tijana.interfaces;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Any class that implements the interface HandleInvalidTimeZoneClient will use
 * the implementation of getZonedDateTime specified by this interface instead of
 * the one specified by the interface TimeClient.
 * 
 * @author ttinana
 *
 */

public interface HandleInvalidTimeZoneClient extends TimeClient {
	default public ZonedDateTime getZonedDateTime(String zoneString) {
		try {
			return ZonedDateTime.of(getLocalDateTime(), ZoneId.of(zoneString));
		} catch (DateTimeException e) {
			System.err.println("Invalid zone ID: " + zoneString + "; using the default time zone instead.");
			return ZonedDateTime.of(getLocalDateTime(), ZoneId.systemDefault());
		}
	}

}
