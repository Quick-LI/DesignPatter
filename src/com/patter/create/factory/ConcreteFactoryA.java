package com.patter.create.factory;

import com.patter.create.simplefactory.ConcreteProductA;
import com.patter.create.simplefactory.Product;

public class ConcreteFactoryA extends Factory{

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductA();
	}

}
