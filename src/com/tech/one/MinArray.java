package com.tech.one;

public class MinArray {
	public static void main(String[] args) {
		int arr[]= {5,7,3,9,9,9,5,10};
		
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				//max의 값을 변경
				max=arr[i];//대치
			}
		}
		System.out.println("최대값 : "+max);
	}

}
