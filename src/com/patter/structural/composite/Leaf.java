package com.patter.structural.composite;

public class Leaf extends Component{
	
	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void print(int level) {
		// TODO Auto-generated method stub
		for(int i = 0; i < level; i++) {
			System.out.print("--");
		}
		System.out.println("LeaF" + name);
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
