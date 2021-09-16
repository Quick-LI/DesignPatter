package com.patter.create.factory;

import com.patter.create.simplefactory.ConcreteProductB;
import com.patter.create.simplefactory.Product;

public class ConcreteFactoryB extends Factory{

	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductB();
	}

}
