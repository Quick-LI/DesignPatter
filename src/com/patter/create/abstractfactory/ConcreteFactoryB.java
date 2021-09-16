package com.patter.create.abstractfactory;

public class ConcreteFactoryB extends AbstractFactory{

	@Override
	AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}

	@Override
	AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}

}
