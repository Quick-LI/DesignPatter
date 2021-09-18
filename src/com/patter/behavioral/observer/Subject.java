package com.patter.behavioral.observer;

public interface Subject {
	
	void resisterObserver(Observer o);
	
	void removeObserver(Observer o);
	
	void notifyObserver();
}
