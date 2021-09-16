package com.patter.create.abstractfactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new ConcreteFactoryA();
		AbstractProductA productA = abstractFactory.createProductA();
		AbstractProductB productB = abstractFactory.createProductB();
	}
}
