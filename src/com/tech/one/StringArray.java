package com.tech.one;

import java.util.Random;

public class StringArray {
	public static void main(String[] args) {
		String[] arr= {"홍길동","홍길순","강감찬","이순신","김유신"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("출력 "+arr[i]);
		}
		
		//for each문   for문의 확장판
		for (String name : arr) {
			System.out.println(name);
		}
	}
}
