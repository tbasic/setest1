package com.tech.one;

public class MinArray {
	public static void main(String[] args) {
		int arr[]= {5,7,3,9,9,9,5,10};
		
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				//max�� ���� ����
				max=arr[i];//��ġ
			}
		}
		System.out.println("�ִ밪 : "+max);
	}

}
