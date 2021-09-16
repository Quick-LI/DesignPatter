package com.patter.create.simplefactory;

public class SimpleFactory {
	public Product createProduce(int type) {
		if(type == 1) {
			return new ConcreteProductA();
		}
		if(type == 2) {
			return new ConcreteProductB();
		}
		return new ConcreteProductC();
	}
}
