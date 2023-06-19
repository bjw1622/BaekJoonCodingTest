
import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int weightSum=0;

        if(people.length == 1) return 1;
        
        Arrays.sort(people);
        int start = 0; 
        int end = people.length-1;
        while(start <= end){
            if(people[start]+people[end] > limit){
                end -= 1; answer+=1;
            }else{
                start+=1; end-=1;
                answer+=1;
            }
        }//
        return answer;
    }
}