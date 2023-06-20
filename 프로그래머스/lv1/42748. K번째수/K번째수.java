import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // commands의 길이만큼 돌면서
        // 각 배열에 맞게 파싱한 후 결과 값을 answer에 저장
        for(int i =0; i < commands.length; i++){
            int start = commands[i][0]-1; //1
            int end = commands[i][1]-1; //4
            int target = commands[i][2]-1; // 2
            System.out.println(start);
            List<Integer> sortArr = new ArrayList<>();
            for(int j=start; j<= end; j++){
                sortArr.add(array[j]);
            }
            sortArr.sort((a,b) -> a-b);
            answer[i] = sortArr.get(target);
        }
        return answer;
    }
}