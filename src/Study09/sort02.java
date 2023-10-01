package Study09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sort02 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//입력할 개수
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		//개수만큼 입력받음
		for(int i = 0; i < count; i++) {
			int number = Integer.parseInt(br.readLine());		
			arr[i] = number;			
		}
		
		Arrays.sort(arr);
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}
}
