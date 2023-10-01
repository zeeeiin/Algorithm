package Study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class quiz03 {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String reversedWords = reverseWords(str);
		System.out.println(reversedWords);
	}

	public static String reverseWords(String str) {
		StringBuilder result = new StringBuilder();
		Stack<String> wordStack = new Stack<>();

		int start = 0;
		int end = 0;
		int length = str.length();

		while (end < length) {
			if (str.charAt(end) == '<') {
				if (start != end) {
					String word = str.substring(start, end);
					wordStack.push(word);
				}
				start = end;
				while (end < length && str.charAt(end) != '>') {
					end++;
				}
				start = end + 1;
				end = start;
			} else if (str.charAt(end) == ' ' || end == length - 1) {
				String word;
				if (end == length - 1) {
					word = str.substring(start, end + 1);
				} else {
					word = str.substring(start, end);
				}
				wordStack.push(word);
				start = end + 1;
				end = start;
			} else {
				end++;
			}
		}

		while (!wordStack.isEmpty()) {
			result.append(wordStack.pop());
			if (!wordStack.isEmpty()) {
				result.append(' ');
			}
		}

		return result.toString();
	}


}
