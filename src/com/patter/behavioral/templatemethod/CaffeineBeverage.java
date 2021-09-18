package com.patter.behavioral.templatemethod;

public abstract class CaffeineBeverage {
	
	final void perpareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	abstract void brew();
	
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("boilWater");
	}
	
	void pourInCup() {
		System.out.println("pourInCup");
	}
}
