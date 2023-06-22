import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {
        String answer="";
        String[] str = new String[numbers.length];

        for(int i = 0 ; i<str.length;i++){
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        for(String arr : str)
            answer+=arr;
        
        if(str[0].equals("0")){
            answer = "0";
        }

        return answer;
    }
}