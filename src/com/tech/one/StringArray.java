package com.tech.one;

import java.util.Random;

public class StringArray {
	public static void main(String[] args) {
		String[] arr= {"ȫ�浿","ȫ���","������","�̼���","������"};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("��� "+arr[i]);
		}
		
		//for each��   for���� Ȯ����
		for (String name : arr) {
			System.out.println(name);
		}
	}
}
