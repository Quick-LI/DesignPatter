package com.patter.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

	private List<Observer> observers;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<>();
	}	
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}
	@Override
	public void resisterObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}

}
