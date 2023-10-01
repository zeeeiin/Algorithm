package Study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class Stack_quiz {

	public static void main(String[] args) throws EmptyStackException, IOException {

		/*
		 *  문자열 S가 주어졌을 때, 이 문자열에서 단어만 뒤집으려고 한다.	
			먼저, 문자열 S는 아래와 같은 규칙을 지킨다.			
			알파벳 소문자('a'-'z'), 숫자('0'-'9'), 공백(' '), 특수 문자('<', '>')로만 이루어져 있다.
			문자열의 시작과 끝은 공백이 아니다.

			'<'와 '>'가 문자열에 있는 경우 번갈아가면서 등장하며, '<'이 먼저 등장한다. 또, 두 문자의 개수는 같다.
			태그는 '<'로 시작해서 '>'로 끝나는 길이가 3 이상인 부분 문자열이고, 
			'<'와 '>' 사이에는 알파벳 소문자와 공백만 있다. 

			단어는 알파벳 소문자와 숫자로 이루어진 부분 문자열이고,	연속하는 두 단어는 공백 하나로 구분한다. 
			태그는 단어가 아니며, 태그와 단어 사이에는 공백이 없다.

			첫째 줄에 문자열 S가 주어진다. S의 길이는 100,000 이하이다.
			첫째 줄에 문자열 S의 단어를 뒤집어서 출력한다.
		 */

		String s = "baekjoon online judge";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String str = br.readLine();				
		str = reverse(str);
		System.out.println(str);

	}
	
	public static String reverse(String str) {		
	
		Stack<Character> stack = new Stack<>(); //임시 저장하는 스택	
		Stack<Character> stack2 = new Stack<>(); //문자열을 거꾸로 저장
		StringBuilder sb = new StringBuilder();
		int a = str.indexOf("<");
		int b = str.indexOf(">");				
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); //str의 문자를 char타입 ch에 넣기
			if(ch == '<') { //< 가 있다면
				if(!stack.isEmpty()) {
					stack2.push(stack.pop()); //거꾸로 넣어주기
				}
				stack2.push(ch);
			} else if (ch == '>') { //> 가 있다면
				if(!stack.isEmpty()) {
					stack2.push(stack.pop()); //거꾸로 넣어주기
				}
			} else { //<, > 가 없다면 그냥 넣기
				stack.push(ch);
			}
		}
		
		if(!stack2.isEmpty()) {
			sb.append(stack2.pop());
		} else if(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		sb.reverse();
		
		return sb.toString();
	
	}

}
