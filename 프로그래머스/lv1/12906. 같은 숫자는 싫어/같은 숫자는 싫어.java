import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        ArrayList<Integer> test = new ArrayList<>();

        int prev = -1;
        for(int i=0; i< arr.length; i++){
            if(prev != arr[i]){
                test.add(arr[i]);
                prev = arr[i];
            }
        }
        int[] answer = new int[test.size()];

        for(int i =0; i< test.size();i++){
            answer[i] = test.get(i);
        }
        return answer;
    }
}