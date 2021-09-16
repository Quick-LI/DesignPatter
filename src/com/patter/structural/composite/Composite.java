package com.patter.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	private List<Component> child;
	
	public Composite(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		child = new ArrayList<>();
	}

	@Override
	void print(int level) {
		// TODO Auto-generated method stub
		for(int i = 0; i < level; i++) {
			System.out.print("--");
		}
		System.out.println("Composite" + name);
		for(Component component : child) {
			component.print(level + 1);
		}
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		child.add(component);
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		child.remove(component);
	}

}
