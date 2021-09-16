package com.patter.create.singleton;

//����ʽ-�̰߳�ȫ
//��getUniqueInsetance()��������,��֤ͬһʱ��ֻ����һ���߳̽��뷽��
//�����˶��ʵ����uniqueInstance��������
//�������ᵼ�������̵߳ȴ������ܻ���������
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
