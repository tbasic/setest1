package com.tech.two.tv1;

public class Television {
	private int channel;
	private int volumn;
	private boolean onOff;
	//�ʵ忡���� �ڵ� �ʱ�ȭ �ȴ�
	public static void main(String[] args) {
		//���������� �������� �ʱ�ȭ ���Ѷ�
		int num;
		boolean bool;
		Television tv=new Television();//��ü����
//		System.out.println(num);
//		System.out.println(bool);
		System.out.println(tv.channel);
		System.out.println(tv.onOff);
		tv.channel=7;
		tv.volumn=10;
		tv.onOff=true;
		
		
		System.out.println("Tv�� ä���� "+tv.channel+"�̰� ������ "+tv.volumn+"�Դϴ�.");
		
	}

}
