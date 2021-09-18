package com.patter.behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression {
	
	private String literal = null;
	
	
	public TerminalExpression(String literal) {
		super();
		this.literal = literal;
	}

	@Override
	public boolean interpret(String str) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreElements()) {
			String test = st.nextToken();
			if(test.equals(literal)) {
				return true;
			}
		}
		return false;
	}

}
