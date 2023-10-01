package Study08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class quiz02 {
	
	public static void main(String[] args) throws IOException {
		

        String s = "baekjoon online judge";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = reverse(str);
        System.out.println(str);
    }


	 public static String reverse(String str) {
        StringBuilder result = new StringBuilder();
        Stack<String> wordStack = new Stack<>();

        boolean inTag = false;
        StringBuilder currentWord = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '<') {
                inTag = true;
                if (currentWord.length() > 0) {
                    wordStack.push(currentWord.toString());
                    currentWord.setLength(0);
                }
                result.append(c);
            } else if (c == '>') {
                inTag = false;
                result.append(c);
            } else if (inTag) {
                result.append(c);
            } else if (c == ' ') {
                wordStack.push(currentWord.toString());
                currentWord.setLength(0);
                result.append(c);
            } else {
                currentWord.append(c);
            }
        }

        if (currentWord.length() > 0) {
            wordStack.push(currentWord.toString());
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
