package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex01 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt( br.readLine() ); //배달해야하는 설탕 n킬로그램
		int count5;
		int count3;	
		int count;
		
		if( n % 5 == 0 ) {
			count5 = n / 5;
			System.out.println(count5);
			
		} else{
			//count = n;
			
			for(count5 = n / 5; 0 <= count5; count5--) { //18
				count = n - count5 * 5; //3
				if(count % 3 == 0) {
					count3 = count / 3;
					System.out.println(count5 + count3);
					return;
				}
			}
			System.out.println(-1);
		}
				
	}
}
