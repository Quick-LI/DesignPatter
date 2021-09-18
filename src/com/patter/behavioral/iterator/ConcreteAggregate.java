package com.patter.behavioral.iterator;

public class ConcreteAggregate implements Aggregate {
	
	private Integer[] items;
	
	public ConcreteAggregate() {
		// TODO Auto-generated constructor stub
		items = new Integer[10];
		for(int i = 0; i < items.length; i++) {
			items[i] = i;
		}
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator<Integer>(items);
	}
	
}
