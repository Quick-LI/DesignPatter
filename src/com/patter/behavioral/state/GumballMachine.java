package com.patter.behavioral.state;

public class GumballMachine {

	private State soldOutState;

	private State noQuarterState;

	private State hasQuarterState;

	private State soldState;

	private State state;
	private int count = 0;
	
	public GumballMachine(int numberGumballs) {
		super();
		count = numberGumballs;
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		if(numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0) {
			count--;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public int getCount() {
		return count;
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
}
