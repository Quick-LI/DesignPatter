package com.patter.behavioral.strategy;

public class Duck {
	
	private QuackBehavior quackBehavior;
	
	public void performQuack() {
		if(quackBehavior != null) {
			quackBehavior.quack();
		}
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
