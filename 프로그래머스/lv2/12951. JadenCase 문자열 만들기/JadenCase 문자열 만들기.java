class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i =0; i< s.split(" ").length;i++){
            for(int j=0; j<s.split(" ")[i].length();j++){
                if(j==0){
                    answer += Character.toUpperCase(s.split(" ")[i].charAt(j));
                }
                else if(j==s.split(" ")[i].length()-1 && i != s.split(" ").length-1){
                    answer += Character.toLowerCase(s.split(" ")[i].charAt(j))+" ";
                }
                else{
                    answer += Character.toLowerCase(s.split(" ")[i].charAt(j));
                }
            }
        }
        System.out.println(answer);
        return answer;
    }
}
