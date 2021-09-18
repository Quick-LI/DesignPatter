package com.patter.behavioral.chainofresponsibility;

public abstract class Handler {
	
	protected Handler successor;

	public Handler(Handler successor) {
		super();
		this.successor = successor;
	}
	
	protected abstract void handleRequest(Request request);
}
