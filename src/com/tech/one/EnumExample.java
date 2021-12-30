package com.tech.one;

enum Season {
    봄, 여름, 가을, 겨울
}

public class EnumExample {
    public static void main(String[] args) {
    	for(Season sea : Season.values()){
    	    System.out.println(sea);
        }
    	
    	Season season=Season.가을;
    	System.out.println(season);
    	
    }
}