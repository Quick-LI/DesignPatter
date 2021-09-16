package com.patter.structural.facade;

public class Facade {
	private SubSystem subSystem = new SubSystem();
	
	public void getMethods() {
		subSystem.method1();
		subSystem.method2();
		subSystem.method3();
	}
}
