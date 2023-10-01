package sample;

public class StringQuiz {
	
	public static int solution(int a, int b) {
        int answer = 0;
        String str1 = "";
        String str2 = "";
        int result1;
        int result2;
        
        str1 = String.valueOf(a);
        str2 = String.valueOf(b);
        result1 = Integer.parseInt(str1+str2); 
        result2 = Integer.parseInt(str2+str1); 
        
//      result2 = 2*(Integer.parseInt(str2)* Integer.parseInt(str1));
        System.out.println(result1); //123
        System.out.println(result2); //624
        
        
        return (result1 > result2) ? result1 : (result1 < result2) ? result2 : result1;
        
        
        
        
    }
	 
	 
	 
	 public static void main(String[] args) {
		 solution(12, 3);
	}
}
