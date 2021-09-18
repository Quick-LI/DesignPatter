package com.patter.behavioral.memento;

public interface Calculator {
	
	PreviousCalculationToCareTaker backupLastCalculation();
	
	void restorePreviousCalculaiont(PreviousCalculationToCareTaker memento);
	
	int getCalculationResult();
	
	void setFirstNumber(int firstNumber);
	
	void setSecondNumber(int secondNumber);
}
