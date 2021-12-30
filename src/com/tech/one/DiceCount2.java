package com.tech.one;

import java.util.Arrays;
import java.util.Random;

public class DiceCount2 {
	public static void main(String[] args) {
		
		int [] arr=new int[6];
		Random r=new Random();
		int cnt=0;
		int num;
		//int num=r.nextInt(6)+1;
		//System.out.println(num);
		for (int i = 0; i < 1000; i++) {
			cnt++;
			num=r.nextInt(6)+1;
			//num 를 index 로 주어질순 없을까?
			++arr[num-1];
		}
		System.out.println("주사위던진횟수 : "+cnt);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"면 : "+arr[i]);
		}
		
	}

}
