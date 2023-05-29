class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length - i - 1];
        }
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
        return answer;
    }
}