package com.patter.behavioral.memento;

public class Client {
	public static void main(String[] args) {
		
		Calculator calculator = new CalculatorImp();
		
		calculator.setFirstNumber(10);
		calculator.setSecondNumber(100);
		
		System.out.println(calculator.getCalculationResult());
		
		PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();
		
		calculator.setFirstNumber(17);
		
		calculator.setSecondNumber(-290);
		
		System.out.println(calculator.getCalculationResult());
		
		calculator.restorePreviousCalculaiont(memento);
		
		System.out.println(calculator.getCalculationResult());
	}
}
