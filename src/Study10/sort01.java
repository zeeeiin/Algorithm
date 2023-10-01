package Study10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sort01 {

    public static void main(String[] args) throws IOException {

    	/*
		 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
		 * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
		 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 
		 * 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
		 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
		 * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
		 * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
		 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
		 * 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
		 */
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 배달해야하는 설탕 n킬로그램
        int result = 0; // 최종 봉지 수

        // Use as many 5kg bags as possible
        result = n / 5;
        n %= 5;

        // If the remaining weight can be filled with 3kg bags
        while (result >= 0) {
            if (n % 3 == 0) {
                result += n / 3;
                break;
            }
            // If not, decrease the 5kg bags and add one more 3kg bag
            result--;
            n += 5;
        }

        System.out.println(result);
    }
}