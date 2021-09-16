package com.patter.create.singleton;

//枚举实现单例模式
//是单例模式最佳实现方式
//利用枚举的特性，让JVM保证线程安全和单一实例
public enum Singleton {
	INSTANCE;
}
