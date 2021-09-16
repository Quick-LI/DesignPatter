package com.patter.create.factory;

import com.patter.create.simplefactory.ConcreteProductC;
import com.patter.create.simplefactory.Product;

public class ConcreteFactoryC extends Factory{
	
	@Override
	public Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreteProductC();
	}

}
