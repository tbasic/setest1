package com.tech.two.tv1;

public class Television2 {
	private int channel;
	private int volumn;
	private boolean onOff;
	//�ʵ忡���� �ڵ� �ʱ�ȭ �ȴ�
	public static void main(String[] args) {
	
		Television2 tv1=new Television2();//��ü����
		tv1.channel=7;
		tv1.volumn=10;
		tv1.onOff=true;
		Television2 tv2=new Television2();//��ü����
		tv2.channel=100;
		tv2.volumn=5;
		tv2.onOff=false;
		
		System.out.println("Tv1�� ä���� "+tv1.channel+"�̰� ������ "+tv1.volumn+"�Դϴ�.");
		System.out.println("Tv2�� ä���� "+tv2.channel+"�̰� ������ "+tv2.volumn+"�Դϴ�.");
		
	}

}
