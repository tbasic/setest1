package com.tech.one;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray3 {
	public static void main(String[] args) {
		//�ּҰ� �߰�
//		int arr[]= {5,7,3,9,9,9,5,10};//�迭�� ���� ���� 1~100
		
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		int max=0;
		int min=101;
		
		//for��Ȱ�� �Է¹ޱ�
		for (int i = 0; i < arr.length; i++) {
			System.out.println("input num:");
			arr[i]=s.nextInt();
		}
		System.out.println("�Է°� : "+Arrays.toString(arr));
		
		
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
