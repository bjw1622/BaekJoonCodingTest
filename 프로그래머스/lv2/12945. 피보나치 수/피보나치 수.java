class Solution {
    public int solution(int n) {
        int answer = 0;
        int backTwo = 0;
        int backOne = 1;
        int target = backOne + backTwo;
        for(int i =2; i<=n; i++){
            target = backOne + backTwo;
            backTwo = backOne % 1234567;
            backOne = target % 1234567;
        }
        System.out.println(target%1234567);
        answer = target % 1234567;
        System.out.println(answer);
        return answer;
    }
}