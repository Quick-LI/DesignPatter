package com.patter.behavioral.templatemethod;

public class Coffee extends CaffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Coffee.brew");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Coffee.addCondiments");
	}

}
