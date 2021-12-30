package com.tech.two.tv1;

public class Television {
	private int channel;
	private int volumn;
	private boolean onOff;
	//필드에서는 자동 초기화 된다
	public static void main(String[] args) {
		//지역변수는 수동으로 초기화 시켜라
		int num;
		boolean bool;
		Television tv=new Television();//객체생성
//		System.out.println(num);
//		System.out.println(bool);
		System.out.println(tv.channel);
		System.out.println(tv.onOff);
		tv.channel=7;
		tv.volumn=10;
		tv.onOff=true;
		
		
		System.out.println("Tv의 채널은 "+tv.channel+"이고 볼륨은 "+tv.volumn+"입니다.");
		
	}

}
