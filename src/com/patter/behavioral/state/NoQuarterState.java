package com.patter.behavioral.state;

public class NoQuarterState implements State {
	
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		super();
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You insert a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't insert a quarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there's no quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay first");
	}

}
