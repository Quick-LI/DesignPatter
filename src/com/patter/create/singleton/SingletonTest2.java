package com.patter.create.singleton;

//饿汉式-线程安全
//直接实例化uniqueInstance对象，解决了线程不安全问题
//但直接实例化丧失了延迟实例化节约资源的好处
public class SingletonTest2 {
	private SingletonTest2() {
	}
	private static SingletonTest2 uniqueInstance = new SingletonTest2();
	public static SingletonTest2 getUniqueInsetance() {
		return uniqueInstance;
	}
}
