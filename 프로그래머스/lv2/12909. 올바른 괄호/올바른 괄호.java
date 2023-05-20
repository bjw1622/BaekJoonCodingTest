import java.util.ArrayList;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                arr.add(s.charAt(i));
            } else {
                if (arr.size() == 0) {
                    answer = false;
                    break;
                } else {
                    arr.remove(arr.size() - 1);
                }
            }
        }
        if (arr.size() > 0) {
            answer = false;
        }
        System.out.println(answer);
        return answer;
    }
}