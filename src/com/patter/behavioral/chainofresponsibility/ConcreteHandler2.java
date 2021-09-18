package com.patter.behavioral.chainofresponsibility;

public class ConcreteHandler2 extends Handler {
	
	public ConcreteHandler2(Handler successor) {
		super(successor);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request.getType() == RequestType.type2) {
			System.out.println(request.getName() + " is handle by ConcreteHandler2");
			return;
		}
		if(successor != null) {
			successor.handleRequest(request);
		}
	}

}
