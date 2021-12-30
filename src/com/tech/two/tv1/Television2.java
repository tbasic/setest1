package com.tech.two.tv1;

public class Television2 {
	private int channel;
	private int volumn;
	private boolean onOff;
	//필드에서는 자동 초기화 된다
	public static void main(String[] args) {
	
		Television2 tv1=new Television2();//객체생성
		tv1.channel=7;
		tv1.volumn=10;
		tv1.onOff=true;
		Television2 tv2=new Television2();//객체생성
		tv2.channel=100;
		tv2.volumn=5;
		tv2.onOff=false;
		
		System.out.println("Tv1의 채널은 "+tv1.channel+"이고 볼륨은 "+tv1.volumn+"입니다.");
		System.out.println("Tv2의 채널은 "+tv2.channel+"이고 볼륨은 "+tv2.volumn+"입니다.");
		
	}

}
