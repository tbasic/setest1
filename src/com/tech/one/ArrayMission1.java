package com.tech.one;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayMission1 {

	public static void main(String[] args) {
		/*10개의 요소를 저장할 수 있는 배열 선언
		 * 배열에 성적입력을 받는다 50~100점 사이
		 * 합계, 평균, 최대점수, 최소점수 출력
		 */
		Integer[] arr = new Integer[10];
		int sum = 0;
		float avg = 0.0f;
		int min = 0;
		int max = 0;
		int num = 0;
		
		Random ran = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			num = ran.nextInt(100)+1;;
			arr[i] = num;
			if(num < 50) {
				i--;
			}else {
				sum = sum + arr[i];
			}
		}
		avg = (float)sum/arr.length;
		
		Arrays.sort(arr);
		min = arr[0];
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, Collections.reverseOrder());
		max = arr[0];
		System.out.println(Arrays.toString(arr));
		System.out.println("총점 : "+sum
				+"\t평균 : "+avg
				+"\t최대점수 : "+max
				+"\t최소점수 : "+min);
	}

}
