package sample;

import java.util.Arrays;
import java.util.Scanner;

public class str01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        String str = "";
        
        for(char c : arr) {
        	
        	if( Character.isUpperCase(c)) {
        		//str1 = String.valueOf(c);
        		//str.toLowerCase();    
        		str += Character.toLowerCase(c);
        		//str = String.valueOf(c);
        		str.toLowerCase();
        	} else {
        		str += Character.toUpperCase(c);
        		//String.valueOf(c);
        		//str.toUpperCase();
        	}
        	
        }        
        
        System.out.println(str);
	}
	
}
//for(int i = 0; i < arr.length; i++) {
