package com.patter.behavioral.chainofresponsibility;

public class ConcreteHandler1 extends Handler {

	public ConcreteHandler1(Handler successor) {
		super(successor);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request.getType() == RequestType.type1) {
			System.out.println(request.getName() + " is handle by ConcreteHandler1");
			return;
		}
		if(successor != null) {
			successor.handleRequest(request);
		}
	}
	
	
}
