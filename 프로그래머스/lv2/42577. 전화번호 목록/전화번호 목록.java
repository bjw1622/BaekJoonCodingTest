import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
    	boolean answer = true;
    	
    	HashSet<String> set = new HashSet<String>();
    	
    	for (int i = 0; i < phone_book.length; i++) {
			set.add(phone_book[i]);
		}
        for(String pb:phone_book) {
        	for(int j=1; j<pb.length(); j++) {
        		if(set.contains(pb.subSequence(0, j)))
        			answer = false;
        	}
        }
        return answer;
    }
}