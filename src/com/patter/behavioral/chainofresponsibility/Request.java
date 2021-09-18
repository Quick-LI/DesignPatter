package com.patter.behavioral.chainofresponsibility;

public class Request {
	
	private RequestType type;
	
	private String name;

	public Request(RequestType type, String name) {
		super();
		this.type = type;
		this.name = name;
	}

	public RequestType getType() {
		return type;
	}

	public String getName() {
		return name;
	}
	
	
}
