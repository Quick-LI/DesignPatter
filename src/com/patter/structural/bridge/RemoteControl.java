package com.patter.structural.bridge;

public abstract class RemoteControl {
	protected TV tv;

	public RemoteControl(TV tv) {
		this.tv = tv;
	}
	
	public abstract void on();
	public abstract void off();
	public abstract void tuneChannel();
}
