package com.patter.behavioral.visitor;

public class GeneralReport implements Visitor {
	
	private int customersNo;
	
	private int ordersNo;
	
	private int itemNo;

	@Override
	public void visit(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getName());
		customersNo++;
	}

	@Override
	public void visit(Order order) {
		// TODO Auto-generated method stub
		System.out.println(order.getName());
		ordersNo++;
	}

	@Override
	public void visit(Item item) {
		// TODO Auto-generated method stub
		System.out.println(item.getName());
		itemNo++;
	}
	
	public void displayResults() {
		System.out.println("Number of customers " + customersNo);
		System.out.println("Number of orders " + ordersNo);
		System.out.println("Number of items " + itemNo);
	}

}
