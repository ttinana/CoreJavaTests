/**
 * 
 */
package com.tijana.inheritance.unicorn;

/**
 * @author ttinana
 *
 */
public interface Mythical {
	default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}
