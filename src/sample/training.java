package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class training {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
				
		solution("He11oWor1d", "lloWorl", 2);
	}
	
	public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
       
       		answer = my_string.replaceAll(my_string, overwrite_string);
        	
        	
        	   
        	answer = my_string.substring(0,s).replaceAll(my_string, overwrite_string)
        			.substring(overwrite_string.length(), my_string.length());
        	
        	System.out.println(answer);
          
        
        return answer;
    }
}
