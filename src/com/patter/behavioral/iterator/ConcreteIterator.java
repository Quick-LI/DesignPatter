package com.patter.behavioral.iterator;

public class ConcreteIterator<T> implements Iterator {
	
	private T[] items;
	
	private int position = 0;
	
	public ConcreteIterator(T[] items) {
		// TODO Auto-generated constructor stub
		this.items = items;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return items[position++];
	}

	@Override
	public boolean hashNext() {
		// TODO Auto-generated method stub
		return position < items.length;
	}
	
	

}
