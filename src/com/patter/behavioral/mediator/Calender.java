package com.patter.behavioral.mediator;

public class Calender extends Colleague {

	@Override
	public void onEvent(Mediator mediator) {
		// TODO Auto-generated method stub
		mediator.doEvent("calender");
	}
	
	public void doCalender() {
		System.out.println("doCalender()");
	}
}
