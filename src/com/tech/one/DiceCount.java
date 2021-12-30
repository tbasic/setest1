package com.tech.one;

import java.util.Arrays;
import java.util.Random;

public class DiceCount {
	public static void main(String[] args) {
		//주사위를 1000번굴려서 (random 처리)
		//나오는 숫자를 배열에 저장하고
		//1, ~6까지 몇회 출현하는지 출력하시오
		
		int [] arr=new int[6];
		Random r=new Random();
		int cnt=0;
		int num;
		//int num=r.nextInt(6)+1;
		//System.out.println(num);
		for (int i = 0; i < 10000; i++) {
			cnt++;
			num=r.nextInt(6)+1;
//			switch (num) {
//			case 1:		arr[0]++;	break;
//			case 2:		arr[1]++;	break;
//			case 3:		arr[2]++;	break;
//			case 4:		arr[3]++;	break;
//			case 5: 	arr[4]++;	break;
//			case 6:		arr[5]++;	break;
//			default:
//				break;
//			}	
			//굳~
			if (1 == num) {
				arr[0]++;
			} else if (2 == num) {
				arr[1]++;
			} else if (3 == num) {
				arr[2]++;
			} else if (4 == num) {
				arr[3]++;
			} else if (5 == num) {
				arr[4]++;
			} else if (6 == num) {
				arr[5]++;
			}
		}
		System.out.println("주사위던진횟수 : "+cnt);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"면 : "+arr[i]+" 비율 : "+((float)arr[i]/10000));
		}

		
		
		
	}

}
