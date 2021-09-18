package com.patter.behavioral.state;

public class HasQuarterState implements State {
	
	private GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}

}
