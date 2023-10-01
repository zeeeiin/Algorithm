package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class quiz06 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int k = Integer.parseInt(br.readLine()); //가지고 있는 랜선 개수
//		int n = Integer.parseInt(br.readLine()); //필요한 랜선 개수
		
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		
		//항상 k <= n
		
		int[] arr = new int[k];	
			
		//int count = 0; //랜선개수	
		int result = 0;	
		
		//초기값 설정
		//탐색할 범위에서 가장 왼쪽 끝 인덱스
		int left = 1; //0으로 선언했는데 자꾸 안돼서 찾아보니 최소값 랜선길이가 양수여야해서 1로 초기화한다고 함
		//최소 최대가 각각 0이면 이분탐색을 하지 않고 끝나버림. 입력받는 랜선에서 최대길이 +1 이 최대값으로 잡혀야한다
		
		//탐색할 범위에서 가장 오른쪽 끝 인덱스
		int right = 0; //arr.length-1 했는데 이렇게 하면 배열길이-1이라 안됨
				
		//각 랜선길이 배열에 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if( right < arr[i] ) {
				right = arr[i];
			}
			
			//right = Math.max(right, arr[i]);//가장 긴 랜선길이를 right에 저장
		}
		//정렬
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));	
		
		//랜선 길이 조건 확인 - 이분탐색
		while (left <= right) { 
			int mid = (left + right) / 2; 
			int count = 0; //count를 매번 루프마다 초기화 - 이 선언을 밖에 해서 틀렸음
			for(int length : arr) {
				count += length / mid; //길이 나누기 중간값 count에 누적	
				//System.out.println(count);
			}			
			//범위를 좁혀가며 탐색
			if (count >= n) { //누적된 count 개수가 n보다 많다면 
				//현재 중간길이인 mid로 랜선을 만들 수 있다면
				//더 긴 길이도 되는지 확인해야하기 때문에 최적 길이를 더 큰 값으로 찾기 위해 left를 업데이트
				left = mid + 1; //반복 돌 때 시작점 인덱스를 오른쪽으로 +1 
				result = mid;
				//System.out.println(left);
	        } else {
                //최적 길이를 더 작은 값으로 찾기 위해 right를 업데이트
                right = mid - 1;  
                //System.out.println(right);
            }
	   }
			//System.out.println("------------------------------------");
	        System.out.println(result); // 최적의 랜선 길이인 result 값을 출력
	  }
		
}