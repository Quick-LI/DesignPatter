package com.patter.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Element {

	private String name;
	
	private List<Order> orders = new ArrayList<>();
	
	
	Customer(String name) {
		super();
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	void addOrder(Order order) {
		orders.add(order);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		for(Order order : orders) {
			order.accept(visitor);
		}
	}

}
