package com.patter.create.singleton;

//��̬�ڲ���ʵ��
//�����ʱ����̬�ڲ���û�б����ؽ��ڴ棬�����÷�������SingletonHolder.INSTANCEʱ
//��̬�ڲ���Żᱻ���أ�����ʼ��INSTANCEʵ��
//���ӳ�ʵ�����ĺô����������������֤���̰߳�ȫ
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
