package com.patter.create.singleton;

//饿汉式-线程安全
//对getUniqueInsetance()方法加锁,保证同一时间只能有一个线程进入方法
//避免了多次实例化uniqueInstance对象问题
//但加锁会导致其他线程等待，性能会有所降低
public class SingletonTest3 {
	private static SingletonTest3 uniqueInstance;
	private SingletonTest3() {
	}
	public static synchronized SingletonTest3 getUniqueInsetance() {
		if (uniqueInstance == null) {
			uniqueInstance = new SingletonTest3(); 
		}
		return uniqueInstance;
	}
}
