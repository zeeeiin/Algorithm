package Study09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class sort04 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 
		 * 둘째 줄부터 N개의 줄에는 수가 주어진다. 
		 * 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 
		 * 수는 중복되지 않는다.
		 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int number;
		int[] arr = new int[count];
		for(int i = 0; i < count; i++) {
			number = Integer.parseInt(br.readLine());
			arr[i] = number;
		}
		Arrays.sort(arr);
		for(int j:arr) {
			bw.write(String.valueOf(j)+"\n"); //정수형→ String 형으로 변환
		}
		bw.flush();
	}
}
