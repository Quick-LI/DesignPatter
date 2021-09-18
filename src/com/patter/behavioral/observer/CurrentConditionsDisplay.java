package com.patter.behavioral.observer;

public class CurrentConditionsDisplay implements Observer {
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		weatherData.resisterObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		System.out.println("CurrentConditionDisplay.update " + temp + " " + humidity + " " + pressure);
	}

}
