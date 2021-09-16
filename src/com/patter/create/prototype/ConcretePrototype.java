package com.patter.create.prototype;

public class ConcretePrototype extends Prototype{
	private String filed;
	
	public ConcretePrototype(String filed) {
		// TODO Auto-generated constructor stub
		this.filed = filed;
	}
	@Override
	Prototype myclone() {
		// TODO Auto-generated method stub
		return new ConcretePrototype(filed);
	}
	@Override
	public String toString() {
		return filed;
	}
	
	
}
