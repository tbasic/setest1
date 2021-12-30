package com.tech.one;

public class LabelBreak2 {
	public static void main(String[] args) {
		//label적용
	outout://goto문 종류
	for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==3)
					break outout;
				System.out.println("ij "+i+","+j);
			}
		}
	}
}
