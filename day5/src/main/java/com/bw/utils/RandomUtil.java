package com.bw.utils;

import java.util.Random;

public class RandomUtil {
     public static char randomCharacter() {
    	 String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    	
		return str.charAt(random(0,str.length()-1));
    	 
     }

	public static int random(int min, int max) {
		Random r=new Random();
		
		return r.nextInt(max-min+1)+min;
	}
    

}
