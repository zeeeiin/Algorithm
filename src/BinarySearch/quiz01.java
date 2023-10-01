package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quiz01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 심해에는 두 종류의 생명체 A와 B가 존재한다. A는 B를 먹는다. 
		 * A는 자기보다 크기가 작은 먹이만 먹을 수 있다. 
		 * 예를 들어, A의 크기가 {8, 1, 7, 3, 1}이고, B의 크기가 {3, 6, 1}인 경우에 
		 * A가 B를 먹을 수 있는 쌍의 개수는 7가지가 있다. 8-3, 8-6, 8-1, 7-3, 7-6, 7-1, 3-1.
		 * 두 생명체 A와 B의 크기가 주어졌을 때, A의 크기가 B보다 큰 쌍이 몇 개나 있는지 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
		 * 각 테스트 케이스의 첫째 줄에는 A의 수 N과 B의 수 M이 주어진다. 
		 * 둘째 줄에는 A의 크기가 모두 주어지며, 셋째 줄에는 B의 크기가 모두 주어진다. 
		 * 크기는 양의 정수이다. (1 ≤ N, M ≤ 20,000)
		 *
		 * 2 (테스트 케이스의 개수)
		 * 5 3 ( A의 수 N과 B의 수 M)
		 * 8 1 7 3 1 (A의 크기)
		 * 3 6 1 (B의 크기)
		 * 
		 * 출력
		 * 7		
		 * 각 테스트 케이스마다, A가 B보다 큰 쌍의 개수를 출력한다. 
		 */
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = {};
		int[] arr2 = {};
		int t = Integer.parseInt(br.readLine()); //테스트 케이스 개수
		
		for(int i = 0; i < t; i++) { //a,b의 각각 개수
			String[] size = br.readLine().split(" ");
			int a = Integer.parseInt(size[0]); 
			int b = Integer.parseInt(size[1]);	
			
			arr = new int[a];
			arr2 = new int[b];
			String[] arrstr = br.readLine().split(" ");
			for(int j = 0; j < a; j++) {
				arr[j] = Integer.parseInt(arrstr[j]); //a만큼 숫자 입력			
			}
			String[] arrstr2 = br.readLine().split(" ");
			for(int k = 0; k < b; k++) {
				arr2[k] = Integer.parseInt(arrstr2[k]); //b만큼 숫자 입력			
			}			
		}		
		int left = 0;
		int right = arr.length-1;		
		int count = 0;
		
		Arrays.sort(arr);
		Arrays.sort(arr2);
	
//		while(left <= right) {
//			int mid = (left+right) / 2;
//			if(arr[mid] < arr2[mid]) {
//				right = mid - 1;
//			} else if(arr[mid] > arr2[mid]) {
//				left = mid + 1;
//				count++; 
//			} 
//		}		
		
		for(int i = 0; i < arr.length; i++) {
			int num1 = Arrays.binarySearch(arr, arr[i]);
			int num2 = Arrays.binarySearch(arr2, arr2[i]);					
			if( num1 > num2 ) {
				count++;
			}
		}		
		
		System.out.println(count);
		
	}
}
