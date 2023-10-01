package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class quiz07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 
		 * 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 
		 * 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 
		 * 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 
		 * 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 
		 * 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
		 * 
		 * M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
		 * 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());		
		int[] a = new int[n];
		//n개의 정수 
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(a);
		
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[m];
		//m개의 정수 
		for(int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		
		int left = 0;
		int right = arr.length-1;
		
		while(left <= right) {
			int mid = (left+right) / 2;
		
			if(arr[mid] == a[mid]) {
				System.out.println(1);				
			} else if (arr[mid] > a[mid]) {
//				for(int i =0; i < a.length; i++) {
//					if(a.equals(arr)) {
//						System.out.println(1);
//					} else System.out.println(0);					
//				}
				left = mid + 1;
			} else right = mid - 1;
		}
		System.out.println(0);
	}
}
