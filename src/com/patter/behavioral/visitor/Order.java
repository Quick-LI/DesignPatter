package com.patter.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Order implements Element {
	
	private String name;
	
	private List<Item> items = new ArrayList();
	
	Order(String name){
		this.name = name;
	}
	
	Order(String name, String itemName){
		this.name = name;
		this.addItem(new Item(itemName));
	}

	String getName() {
		return name;
	}
	
	void addItem(Item item) {
		items.add(item);
	}
	
	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		for(Item item : items) {
			item.accept(visitor);
		}
	}

}
