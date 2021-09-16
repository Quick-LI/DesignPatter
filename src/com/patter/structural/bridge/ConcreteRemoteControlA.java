package com.patter.structural.bridge;

public class ConcreteRemoteControlA extends RemoteControl{
	
	public ConcreteRemoteControlA(TV tv) {
		super(tv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteRemoteControl on");
		tv.on();
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteRemoteControl off");
		tv.off();
	}

	@Override
	public void tuneChannel() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteRemoteControl tuneChannel");
		tv.tuneChannel();
	}

}
