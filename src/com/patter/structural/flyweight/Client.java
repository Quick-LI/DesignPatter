package com.patter.structural.flyweight;

public class Client {
	public static void main(String[] args) {
		FlyweightFactory facotry = new FlyweightFactory();
		Flyweight flyweight1 = facotry.getFlyweight("aa");
		Flyweight flyweight2 = facotry.getFlyweight("aa");
		flyweight1.doOperation("x");
		flyweight2.doOperation("y");
	}
}
