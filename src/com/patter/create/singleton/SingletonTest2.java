package com.patter.create.singleton;

//����ʽ-�̰߳�ȫ
//ֱ��ʵ����uniqueInstance���󣬽�����̲߳���ȫ����
//��ֱ��ʵ����ɥʧ���ӳ�ʵ������Լ��Դ�ĺô�
public class SingletonTest2 {
	private SingletonTest2() {
	}
	private static SingletonTest2 uniqueInstance = new SingletonTest2();
	public static SingletonTest2 getUniqueInsetance() {
		return uniqueInstance;
	}
}
