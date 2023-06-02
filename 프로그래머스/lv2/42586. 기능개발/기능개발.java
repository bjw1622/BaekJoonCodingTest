import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answerList = new ArrayList<>();

        // 반복횟수
        int temp = 1;

        // pop하는 갯수
        int count = 0;

        for(int i=0; i< progresses.length;i++){
            boolean isNotFinshed = true;
            while(isNotFinshed){
                if(100-(progresses[i]+(speeds[i]*temp)) <=0){
                    count += 1;
                    isNotFinshed = false;
                }
                else if(100-(progresses[i]+(speeds[i]*temp)) >0 && count >0){
                    answerList.add(count);
                    count = 0;
                    temp+=1;
                }
                else{
                    temp+=1;
                }
            }
        }
        answerList.add(count);
        int[] answer = new int[answerList.size()];
        for(int i =0; i< answerList.size();i++){
            answer[i] = answerList.get(i);
        }
        for(int i : answer){
            System.out.println(i);
        }
        
        
        return answer;
    }
}