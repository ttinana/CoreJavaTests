package com.tijana.java7.inheritance.unicorn;

public interface Flyer {
	default public String identifyMyself() {
		return "I am able to fly.";
	}

}
