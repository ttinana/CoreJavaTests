package com.tijana.inheritance.catsStatic;

class Cat extends Animal implements AnimalI {

	public static void main(String[] args) {
		AnimalI.identify();
		
		Cat.identifyClass();
		//Cat.identify(); // This does not compile, because interface static
						// methods do not inherit. (Why?)
	}
}