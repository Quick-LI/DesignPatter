package com.patter.behavioral.iterator;

public class Client {
	
	public static void main(String[] args) {
		Aggregate aggregate = new ConcreteAggregate();
		Iterator<Integer>iterator = aggregate.createIterator();
		while(iterator.hashNext()) {
			System.out.println(iterator.next());
		}
	}
}
