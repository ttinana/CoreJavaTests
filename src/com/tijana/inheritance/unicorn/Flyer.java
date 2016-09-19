package com.tijana.inheritance.unicorn;

public interface Flyer {
	default public String identifyMyself() {
		return "I am able to fly.";
	}

}
