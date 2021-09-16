package com.patter.structural.decorator;

public class Mocha extends CondimentDecorator {

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1 + beverage.cost();
	}

}
