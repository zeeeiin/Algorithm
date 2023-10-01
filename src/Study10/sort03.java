package Study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort03 {
	
	public static void main(String[] args) throws IOException {
		/*
		 * 이가 N으로 같은 문자열 X와 Y가 있을 때, 두 문자열 X와 Y의 차이는 X[i] ≠ Y[i]인 i의 개수이다.
		 * 예를 들어, X=”jimin”, Y=”minji”이면, 둘의 차이는 4이다.
		 * 
		 * 두 문자열 A와 B가 주어진다. 이때, A의 길이는 B의 길이보다 작거나 같다. 
		 * 이제 A의 길이가 B의 길이와 같아질 때 까지 다음과 같은 연산을 할 수 있다.
		 * 
		 * A의 앞에 아무 알파벳이나 추가한다.
		 * A의 뒤에 아무 알파벳이나 추가한다.
		 * 이 때, A와 B의 길이가 같으면서, A와 B의 차이를 최소로 하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 A와 B가 주어진다. A와 B의 길이는 최대 50이고, 
		 * A의 길이는 B의 길이보다 작거나 같고, 알파벳 소문자로만 이루어져 있다.
		 * A와 B의 길이가 같으면서, A와 B의 차이를 최소가 되도록 했을 때, 그 차이를 출력하시오.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = 0;
		String a = br.readLine();
		String b = br.readLine();
		
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		
		if( arr1.length >= arr2.length) {
			
			for(int i = 0; i < arr1.length; i++) {
				
				if( arr1[i] != arr2[i]) {
					count++;
				}
			}
			
			
			
		}
		System.out.println(count);
		
	}
}
