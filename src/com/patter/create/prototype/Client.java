package com.patter.create.prototype;

public class Client {
	public static void main(String[] args) {
		Prototype prototype = new ConcretePrototype("abc");
		prototype.toString();
	}
}
