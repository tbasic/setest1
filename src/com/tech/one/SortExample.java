package com.tech.one;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		
		int[] arr= {50,30,20,70,90};
		
		System.out.println(Arrays.toString(arr));
		
		//sort�����ϱ�
		for (int a = 0; a < arr.length; a++) {
			for (int b = 0; b < arr.length; b++) {
				//���������ؼ� ��ġ �ٲٱ�
				if (arr[a]<arr[b]) {
					int tmp=arr[b];
					arr[b]=arr[a];
					arr[a]=tmp;		
				}	
			}
		}
		//���
		//for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr));
		//}
		
		
	}

}
