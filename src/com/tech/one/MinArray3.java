package com.tech.one;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray3 {
	public static void main(String[] args) {
		//최소값 추가
//		int arr[]= {5,7,3,9,9,9,5,10};//배열에 오는 수는 1~100
		
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		int max=0;
		int min=101;
		
		//for문활용 입력받기
		for (int i = 0; i < arr.length; i++) {
			System.out.println("input num:");
			arr[i]=s.nextInt();
		}
		System.out.println("입력값 : "+Arrays.toString(arr));
		
		
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
