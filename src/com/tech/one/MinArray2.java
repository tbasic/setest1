package com.tech.one;

public class MinArray2 {
	public static void main(String[] args) {
		//�ּҰ� �߰�
		int arr[]= {5,7,3,9,9,9,5,10};//�迭�� ���� ���� 1~100
		
		int max=0;
		int min=101;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				//max�� ���� ����
				max=arr[i];//��ġ
			}
			
			if (arr[i]<min) {
				//min�� ���� ����
				min=arr[i];//��ġ
			}
			
		}
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
	}

}
