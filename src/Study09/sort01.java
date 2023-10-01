package Study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/*
		 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 
		 * 둘째 줄부터 N개의 줄에는 수가 주어진다. 
		 * 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
		 * 
		 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력할 개수
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		//개수만큼 입력받음
		for(int i = 0; i < count; i++) {
			int number = Integer.parseInt(br.readLine());		
			arr[i] = number;			
		}
		quickSort(arr, 0, arr.length-1);
		for(int i = 0; i < count; i++) {
			//오름차순으로 정렬한 결과를 한 줄에 하나씩 출력
			System.out.println(arr[i]);			
		}
	}
	
	//퀵 정렬 알고리즘이 요소들을 분할하기 위해 
	//피벗(pivot) 값을 기준으로 작은 값과 큰 값의 위치를 교환하기 때문에 두 요소의 위치 교환
	//swap 메서드를 사용하여 요소들의 위치를 교환하면서 배열을 정렬하는 과정을 수행해야함.
	public static void swap(int[] arr, int pl, int pr) {
		int temp = arr[pl];
		arr[pl] = arr[pr];
		arr[pr] = temp;
	}	
		
	//left는 현재 분할된 왼쪽 배열의 시작 인덱스
	//right는 현재 분할된 오른쪽 배열의 끝 인덱스
	public static void quickSort(int[] arr, int left, int right) {
		int pl = left; //pl은 현재 분할된 오른쪽 배열의 시작 인덱스 
		int pr = right; //pr은 현재 분할된 왼쪽 배열의 끝 인덱스
		int pivot = arr[(pl+pr)/2];				
		if( left >= right ) return;		
		//퀵 정렬의 분할 단계
		while(pl <= pr) { //pl은 왼쪽에서 오른쪽으로 이동하면서 pivot보다 크거나 같은 값을 탐색
			while(arr[pl] < pivot) {
				pl++;
			}
			while(arr[pr] > pivot) { //pr은 오른쪽에서 왼쪽으로 이동하면서 pivot보다 작거나 같은 값을 탐색
				pr--;
			}
			if(pl <= pr) { //pl과 pr이 교차하지 않을 때마다 두 요소를 교환
				swap(arr, pl++, pr--);
			}			
		}		
		//분할한 배열을 호출
		if( left < pr ) { //왼쪽 배열에 더 분할할 수 있는 요소가 있다면
			quickSort(arr, left, pr); //왼쪽 배열을 다시 분할하여 정렬		
		}
		if( right > pl ) { //오른쪽 배열의 크기가 2개 이상인 경우
			quickSort(arr, pl, right);
		}		
	}
}
