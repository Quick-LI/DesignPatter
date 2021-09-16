package com.patter.create.singleton;

//�������ģʽ
//����ʽ-�̲߳���ȫ
//˽�о�̬����uniqueInstance���ӳ�ʵ����
//û���õ�����ʱ������ʵ����uniqueInstance����Լ��Դ
//�ڶ��̻߳����²���ȫ���п��ܻ�ִ�ж�δ���������䣬���¶��ʵ����uniqueInstance
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
