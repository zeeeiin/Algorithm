package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class quiz03 {

	public static void main(String[] args) {
		/*
		 * 0 ~ 100 까지의 랜덤수 30개를 배열에 넣고 (중복 되지 않게, 정렬)
		 * 0 ~ 100 사이의 랜덤수 1개를 다시 만들어서
		 * 그 수가 배열안에 있는지 이진탐색으로 찾아냅니다!
		 * 찾을 때까지 생성, 탐색 해주세요!
		 */

		Set<Integer> ranNum = new HashSet<>();
		Random random = new Random();

		while(ranNum.size() < 30) { //hash에 랜덤수 30개 추가
			int num = random.nextInt(101);
			ranNum.add(num);
		}

		List<Integer> list = new ArrayList<>(ranNum); //리스트에 담아서 정렬
		Collections.sort(list);
		int search = random.nextInt(101); //랜덤한 수 하나 생성 - 찾을 값

		int mid = 0;
		int left = 0;
		int right = list.size()-1;

		System.out.println("===================================");
		System.out.println("랜덤한 수 30개 조합 완료!");
		System.out.println("찾아야 할 값 : " + search);
		System.out.println("만들어진 배열 : " + list);
		
		if(left > right) {
			System.out.println("찾을 수 없습니다!");	
		} else {
			while(left <= right) {
	
				mid = (left+right) / 2;
					
				if( search <= list.get(mid)) {
					right = mid - 1;
				} else if( search >= list.get(mid)) {
					left = mid + 1;				
				} else {				
					break;
				}			
			}
			System.out.println("찾았습니다!" + left  + "번 인덱스에 있었어요!");
		}
		
		System.out.println("===================================");

	}
}
