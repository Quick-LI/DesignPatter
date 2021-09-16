package com.patter.structural.composite;

public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		Component node1 = new Leaf("1");
		Component node2 = new Composite("2");
		Component node3 = new Leaf("3");
		root.add(node1);
		root.add(node2);
		root.add(node3);
		Component node21 = new Leaf("21");
		Component node22 = new Composite("22");
		root.add(node21);
		root.add(node22);
		Component node220 = new Leaf("220");
		root.add(node220);
		root.print();
	}
}
