import java.util.*;

class Solution {
    
    public int countChar(String s, char c) {
        return s.length() - s.replace(String.valueOf(c), "").length();
    }
    
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int count = 0;
        int zero = 0;
        
        while(!s.equals("1")){

            count += 1;
            zero += countChar(s, '0');
            
            s = s.replace("0", "");
            
            s = Integer.toBinaryString(s.length());
        
        }
        answer[0] = count;
        answer[1] = zero;
        

        return answer;
    }
}