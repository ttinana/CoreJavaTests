package com.tijana.java7.inheritance.superTypeMethodsConflict;

public interface Animal {
	default public String identifyMyself() {
        return "I am an animal.";
    }

}
