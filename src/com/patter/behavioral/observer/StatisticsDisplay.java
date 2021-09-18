package com.patter.behavioral.observer;

public class StatisticsDisplay implements Observer {
	
	public StatisticsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		weatherData.resisterObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		System.out.println("StatisticsDisplay.update " + temp + " " + humidity + " " + pressure);
	}

}
