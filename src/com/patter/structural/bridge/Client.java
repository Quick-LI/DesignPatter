package com.patter.structural.bridge;

public class Client {
	public static void main(String[] args) {
		RemoteControl remoteControl = new ConcreteRemoteControlA(new RCA());
		remoteControl.on();
		remoteControl.off();
		remoteControl.tuneChannel();
	}
}
