package com.tech.one;

public class MinArray2 {
	public static void main(String[] args) {
		//최소값 추가
		int arr[]= {5,7,3,9,9,9,5,10};//배열에 오는 수는 1~100
		
		int max=0;
		int min=101;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				//max의 값을 변경
				max=arr[i];//대치
			}
			
			if (arr[i]<min) {
				//min의 값을 변경
				min=arr[i];//대치
			}
			
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

}
