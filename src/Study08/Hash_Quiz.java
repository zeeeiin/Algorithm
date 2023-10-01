package Study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Hash_Quiz {

	public static void main(String[] args) throws IOException {
		/*
		 *  문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
			부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
			
			예를 들어, ababc의 부분 문자열은 
			a, b, a, b, c, ab, ba, ab, bc, aba, 
			bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.
		 */
		
		/*
		 * if(map.containsKey(c)) { // map에 해당 문자가 있다면
				//count++;
				map.put(c, count+1 );
			} else {
				map.put(c, count+0);
			}
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, String> map = new HashMap<>();
		
		//String str = "ababc";
		String s = br.readLine();
		int count = 0;
		
		//char[] c = s.toCharArray();
		//for(char c : s.toCharArray() )
		//문자열을 char 배열 형태로 하고 문자 꺼내기
		//map.put(c, count+1);
						
		if( s.length() >= 1 ) {
			for(int i = 0; i < s.length(); i++) {
				String str = s.substring(i);
				map.put(i, str); //[ababc, babc, abc, bc, c]
				for(int j = 0; j < str.length(); j++) {
					String str2 = s.substring(j);
					map.put(j, str2);
				}
			}
		}
		
		System.out.println(map.size());
		System.out.println(map.keySet());
		System.out.println(map.values());
	
	}
}
