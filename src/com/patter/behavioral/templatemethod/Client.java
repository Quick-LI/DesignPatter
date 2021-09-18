package com.patter.behavioral.templatemethod;

public class Client {
	public static void main(String[] args) {
		CaffeineBeverage caffeineBeverage = new Coffee();
		caffeineBeverage.perpareRecipe();
		System.out.println("-----------");
		caffeineBeverage = new Tea();
		caffeineBeverage.perpareRecipe();
		
	}
}
