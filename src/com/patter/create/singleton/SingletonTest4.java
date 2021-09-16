package com.patter.create.singleton;


//˫��У����-�̰߳�ȫ
//��������ֻ��Ҫ��ʵ�������ּ��ɣ�ֻ�е�uniqueInstanceû�б�ʵ����ʱ������Ҫ����
//ʹ������if�����жϣ���֤����߳�ͬʱ����if�������ڽ���һ���жϣ���֤����ʵ�������
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
