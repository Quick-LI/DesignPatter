package com.patter.behavioral.visitor;

public class Item implements Element {
	
	private String name;
	
	Item(String name){
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
