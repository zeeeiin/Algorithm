package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class quiz02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 
		 * 상근이는 숫자 카드 N개를 가지고 있다.  
		 * 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 
		 * 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
		 * 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 
		 * 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고,10,000,000보다 작거나 같다.
		 * 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 
		 * 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며,
		 * 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
		 * 첫째 줄에 입력으로 주어진 M개의 수에 대해서, 
		 * 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
		 * 입력
		 * 10
		 * 6 3 2 10 10 10 -10 -10 7 3
		 * 8
		 * 10 9 -5 2 3 4 5 -10
		 * 출력
		 * 3 0 0 1 2 0 0 2
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //숫자카드 개수
		int[] arr = new int[n];
		String[] str = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]); //숫자카드에 적힌 정수
		}
		
		int m = Integer.parseInt(br.readLine()); //정수 m개
		int[] arr2 = new int[m];
		String[] str2 = br.readLine().split(" ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < str2.length; j++) { //m?
				arr2[j] = Integer.parseInt(str2[j]); //주어진 정수m개
			}
		}
		
		Arrays.sort(arr);
		Arrays.sort(arr2);

		int[] arr3 = new int[arr2.length];
		
//		for(int i = 0; i < arr.length; i++) {
//			int count = 0; //초기화
//			num = arr2[i];
//			int search = Arrays.binarySearch(arr, num);
//			if(search >= 0) {
//				count++;				
//			}
//			arr3[i] = count;			
//			System.out.println(count + " ");
//		}		
		
		for(int i = 0; i < arr2.length; i++) {
			int left= 0, right = arr.length-1;			
			int num = arr2[i];
			int count = 0;
			
			while(left <= right) {
					
				int mid = (left+right) /2;
				if(arr[mid] > num) {
					right = mid-1;
				} else if(arr[mid] < num) {
					left = mid+1;
				} else if( arr[mid] == num ) {
					count++;
					 left = mid + 1;					
				}
		//		System.out.println(count + " ");
			} 
			arr3[i] = count;
			System.out.println(arr3[i] + " ");
		}		
	}
}
