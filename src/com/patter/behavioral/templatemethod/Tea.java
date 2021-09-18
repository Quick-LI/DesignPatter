package com.patter.behavioral.templatemethod;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Tea.brew");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Tea.addCondiments");
	}

}
