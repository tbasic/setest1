package com.tech.one;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayMission1 {

	public static void main(String[] args) {
		/*10���� ��Ҹ� ������ �� �ִ� �迭 ����
		 * �迭�� �����Է��� �޴´� 50~100�� ����
		 * �հ�, ���, �ִ�����, �ּ����� ���
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
		System.out.println("���� : "+sum
				+"\t��� : "+avg
				+"\t�ִ����� : "+max
				+"\t�ּ����� : "+min);
	}

}
