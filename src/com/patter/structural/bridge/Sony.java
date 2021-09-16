package com.patter.structural.bridge;

public class Sony extends TV{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("Sony ON");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("Sony OFF");
	}

	@Override
	public void tuneChannel() {
		// TODO Auto-generated method stub
		System.out.println("Sony TuneChannel");
	}

}
