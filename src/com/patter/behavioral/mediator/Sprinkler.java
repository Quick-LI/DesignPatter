package com.patter.behavioral.mediator;

public class Sprinkler extends Colleague {

	@Override
	public void onEvent(Mediator mediator) {
		// TODO Auto-generated method stub
		mediator.doEvent("sprinkler");
	}
	
	public void doSprinkler() {
		System.out.println("doSprinkler()");
	}
}
