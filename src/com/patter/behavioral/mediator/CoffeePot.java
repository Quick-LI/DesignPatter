package com.patter.behavioral.mediator;

public class CoffeePot extends Colleague {

	@Override
	public void onEvent(Mediator mediator) {
		// TODO Auto-generated method stub
		mediator.doEvent("coffeePot");
	}
	
	public void doCoffeePot() {
		System.out.println("doCoffeePot()");
		
	}
}
