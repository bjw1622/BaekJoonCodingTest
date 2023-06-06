class Solution {
    public int[] solution(int brown, int yellow) {
            int total = brown + yellow;
            int[] answer = new int[2];
            for(int i =1; i<=total;i++){
                if(total % i == 0 ){
                    if((total/i -2) *(i-2)==yellow && i>=total/i){
                        answer[0] = i;
                        answer[1] = total/i;
                    }
                }
            }
            for(int i : answer){
                System.out.println(i);
            }
        return answer;
    }
}