package com.tech.one;

enum Season {
    ��, ����, ����, �ܿ�
}

public class EnumExample {
    public static void main(String[] args) {
    	for(Season sea : Season.values()){
    	    System.out.println(sea);
        }
    	
    	Season season=Season.����;
    	System.out.println(season);
    	
    }
}