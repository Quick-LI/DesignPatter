package com.patter.create.abstractfactory;

public class ConcreteFactoryA extends AbstractFactory{

	@Override
	AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	@Override
	AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
