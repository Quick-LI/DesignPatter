package com.patter.behavioral.mediator;

public class Alarm extends Colleague {

	@Override
	public void onEvent(Mediator mediator) {
		// TODO Auto-generated method stub
		mediator.doEvent("alarm");
	}
	
	public void doAlarm() {
		System.out.println("doAlarm()");
	}
}
