package com.patter.structural.bridge;

public class RCA extends TV{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("RCA ON");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("RCA OFF");
	}

	@Override
	public void tuneChannel() {
		// TODO Auto-generated method stub
		System.out.println("RCA TuneChannel");
	}

}
