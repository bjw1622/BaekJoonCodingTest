import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int count = 0;
        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) {
            lostList.add(i);
        }
        lostList.sort((o1, o2) -> o1-o2);
        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) {
            reserveList.add(i);
        }
reserveList.sort((o1, o2) -> o1-o2);
        for(int i =0; i< lostList.size(); i++ ){
            if (reserveList.contains(lostList.get(i))){
                reserveList.remove(Integer.valueOf(lostList.get(i)));
                lostList.remove(i);
                count += 1;
            }
        }
        for (int i = 0; i < lostList.size(); i++) {
            if (reserveList.contains(lostList.get(i))){
                reserveList.remove(Integer.valueOf(lostList.get(i)));
                count += 1;
            }
            else if (reserveList.contains(lostList.get(i)-1)){
                reserveList.remove(Integer.valueOf(lostList.get(i)-1));
                count += 1;
            }
            else if (reserveList.contains(lostList.get(i)+1)){
                reserveList.remove(Integer.valueOf(lostList.get(i)+1));
                count += 1;
            }
        }
        answer = n-(lost.length-count);
        
        return answer;
    }
}