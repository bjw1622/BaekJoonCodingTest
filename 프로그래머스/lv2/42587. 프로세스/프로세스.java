import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
 
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }
        
        while (!queue.isEmpty()) {
            int max = 0;
 
            for (int a : queue) {
                if (a > max) max = a;
            }
 
            if (queue.peek() >= max) { 
                answer++; 
                
                if (location == 0) {
                    break;
                } else {
                    queue.poll();
                    location--;
                }
            } else {
                queue.add(queue.peek()); 
                queue.poll(); 
 
                if (location == 0) {
                    location = queue.size() - 1;
                } else {
                    location--;
                }
            }
        }
 
        return answer;
    }
}
