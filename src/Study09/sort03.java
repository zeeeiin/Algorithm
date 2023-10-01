package Study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort03 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
		 * 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
		 * 두 번째로 큰 정수를 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] st = br.readLine().split(" ");
		int[] array = {Integer.parseInt(st[0]), Integer.parseInt(st[1]), Integer.parseInt(st[2])};

		Arrays.sort(array);
		System.out.println(array[1]);
		
		
		
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(Integer.parseInt(st[0]));
		arr.add(Integer.parseInt(st[1]));
		arr.add(Integer.parseInt(st[2]));
		Collections.sort(arr);
		System.out.println(arr.get(1));
		
		int a = Integer.parseInt(st[0]);
		int b = Integer.parseInt(st[1]);
		int c = Integer.parseInt(st[2]);
		int second=0;
		
		if(1 <= a && a <= 100 && 1 <= b && b <= 100 && 1 <= c && c <= 100) {
			
			if(a >= b && b <= c) {
				second = b;
			} else if( b >= a && a >= c){
				second = a;
			} else if( c >= a && c <= b) {
				second = c;
			}
		}
		System.out.println(second);
	}
}
