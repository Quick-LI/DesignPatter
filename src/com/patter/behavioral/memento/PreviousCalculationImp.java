package com.patter.behavioral.memento;

public class PreviousCalculationImp implements PreviousCalculationToCareTaker, PreviousCalculationToOriginator {
	
	private int firstNumber;
	
	private int secondNumber;
	
	
	public PreviousCalculationImp(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	@Override
	public int getFirstNumber() {
		// TODO Auto-generated method stub
		return firstNumber;
	}

	@Override
	public int getSecondNumber() {
		// TODO Auto-generated method stub
		return secondNumber;
	}

}
