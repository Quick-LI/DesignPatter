package com.patter.create.singleton;


//双重校验锁-线程安全
//加锁操作只需要对实例化部分即可，只有当uniqueInstance没有被实例化时，才需要加锁
//使用两个if进行判断，保证多个线程同时进入if代码块后，在进行一次判断，保证不会实例化多次
public class SingletonTest4 {
	private volatile static SingletonTest4 uniqueInstance;
	private SingletonTest4() {
	}
	public static SingletonTest4 getUniqueInsetance() {
		if (uniqueInstance == null) {
			synchronized(SingletonTest4.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new SingletonTest4(); 
				}
			}
		}
		return uniqueInstance;
	}
}
