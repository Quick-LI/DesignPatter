package com.patter.behavioral.memento;

public class CalculatorImp implements Calculator {
	
	private int firstNumber;
	
	private int secondNumber;
	
	@Override
	public PreviousCalculationToCareTaker backupLastCalculation() {
		// TODO Auto-generated method stub
		return new PreviousCalculationImp(firstNumber, secondNumber);
	}

	@Override
	public void restorePreviousCalculaiont(PreviousCalculationToCareTaker memento) {
		// TODO Auto-generated method stub
		this.firstNumber = ((PreviousCalculationToOriginator) memento).getFirstNumber();
		this.secondNumber = ((PreviousCalculationToOriginator) memento).getSecondNumber();
	}

	@Override
	public int getCalculationResult() {
		// TODO Auto-generated method stub
		return firstNumber + secondNumber;
	}

	@Override
	public void setFirstNumber(int firstNumber) {
		// TODO Auto-generated method stub
		this.firstNumber = firstNumber;
	}

	@Override
	public void setSecondNumber(int secondNumber) {
		// TODO Auto-generated method stub
		this.secondNumber = secondNumber;
	}

}
