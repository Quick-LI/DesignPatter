package com.patter.create.singleton;

//静态内部类实现
//类加载时，静态内部类没有被加载进内存，当调用方法出现SingletonHolder.INSTANCE时
//静态内部类才会被加载，并初始化INSTANCE实例
//有延迟实例化的好处，并且由虚拟机保证了线程安全
public class SingletonTest5 {
	private SingletonTest5(){
	}
	private static class SingletonHolder{
		private static final SingletonTest5 INSTANCE = new SingletonTest5();
	}
	public static SingletonTest5 getUniqueInstance() {
		return SingletonHolder.INSTANCE;
	}
}
