package com.tech.one;

public class LabelBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==3)
					break;
				System.out.println("ij "+i+","+j);
			}
		}
	}

}
