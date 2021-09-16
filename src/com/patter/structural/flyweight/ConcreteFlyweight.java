package com.patter.structural.flyweight;

public class ConcreteFlyweight implements Flyweight {
	
	private String intrinsicState;
	
	
	public ConcreteFlyweight(String intrinsicState) {
		super();
		this.intrinsicState = intrinsicState;
	}
	
	@Override
	public void doOperation(String extrinsicState) {
		// TODO Auto-generated method stub
		System.out.println("Object address " + System.identityHashCode(this));
		System.out.println("IntrinsicState " + intrinsicState);
		System.out.println("ExtrinsicState " + extrinsicState);
	}

}
