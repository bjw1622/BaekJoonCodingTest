class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.parseInt(s.split(" ")[0]);
        int min = Integer.parseInt(s.split(" ")[0]);
        for(int i =1; i< s.split(" ").length;i++){
            if(Integer.parseInt(s.split(" ")[i]) > max){
                max = Integer.parseInt(s.split(" ")[i]);
            } else if (Integer.parseInt(s.split(" ")[i]) < min) {
                min = Integer.parseInt(s.split(" ")[i]);
            }
        }
        answer += min;
        answer += " "+max;
        return answer;
    }
}