package com.patter.behavioral.interpreter;

public class Client {
	public static Expression buildInterpreterTree() {
		Expression treminal1 = new TerminalExpression("A");
		Expression treminal2 = new TerminalExpression("B");
		Expression treminal3 = new TerminalExpression("C");
		Expression treminal4 = new TerminalExpression("D");
		
		Expression alernation1 = new OrExpression(treminal2, treminal3);
		
		Expression alernation2 = new OrExpression(treminal1, alernation1);
		
		return new AndExpression(treminal4, alernation2);
	}
	public static void main(String[] args) {
		Expression define = buildInterpreterTree();
		String context1 = "D A";
		String context2 = "A B";
		System.out.println(define.interpret(context1));
		System.out.println(define.interpret(context2));
	}
}
