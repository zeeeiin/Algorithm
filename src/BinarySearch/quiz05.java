package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quiz05 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * 수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.
		 * 예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 
		 * 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.
		 * 
		 * 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다.
		 * 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000,000)
		 * 
		 * 첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.
		 * 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine()); //수열 A
		int[] arr = new int[a];
		for(int i = 0; i < a; i++) { //수열을 이루는 숫자들
			arr[i] = Integer.parseInt(br.readLine());			
		}
		Arrays.sort(arr);
		int left = 0, right = arr.length-1;
		int[] arr2 = {};
		int length = 0;
		while(left <= right) {
			int mid = (left + right) / 2;
			for(int i = 0; i < arr.length; i++) {	
				if(arr[mid] < arr[right]) {
					right = mid - 1;
			//		arr2[i] = 
				} else if(arr[mid] > arr[left]) {
					left = mid + 1;
				} else {
				//	arr2[]
				}
			}
			length = arr2.length;
		}
		System.out.println(length);
		
	}

}
