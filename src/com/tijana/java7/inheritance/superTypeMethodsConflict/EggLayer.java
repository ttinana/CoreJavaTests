package com.tijana.java7.inheritance.superTypeMethodsConflict;

public interface EggLayer {
	default public String identifyMyself() {
		return "I am able to lay eggs.";
	}

}
