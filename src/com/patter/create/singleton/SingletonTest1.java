package com.patter.create.singleton;

//单例设计模式
//懒汉式-线程不安全
//私有静态变量uniqueInstance被延迟实例化
//没有用到该类时，不会实例化uniqueInstance，节约资源
//在多线程环境下不安全，有可能会执行多次创建对象语句，导致多次实例化uniqueInstance
public class SingletonTest1 {
	private static SingletonTest1 uniqueInstance;
	private SingletonTest1() {
	}
	public static SingletonTest1 getUniqueInsetance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonTest1(); 
		}
		return uniqueInstance;
	}
}
