package com.patter.structural.decorator;

public class Milk extends CondimentDecorator {
	
	
	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1 + beverage.cost();
	}

}
