import java.util.ArrayList;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        // skillChar에 해당 스킬이 저장됐는지 확인 후 저장되었으면 첫번째 요소랑 같으면 pop
        for(int i =0; i<skill_trees.length; i++){
            boolean isChecked = true;
            ArrayList<Character> skillChar = new ArrayList<>();
            for(int z=0; z<skill.length();z++){
                skillChar.add(skill.charAt(z));
            }
            for(int j=0; j<skill_trees[i].length();j++){
                // 값이 있는지 비교하고 있을 때 첫번쨰 요소랑 같으면 pop
                if(skillChar.contains(skill_trees[i].charAt(j))){
                    if(skill_trees[i].charAt(j) == skillChar.get(0)){
                        skillChar.remove(0);
                    }
                    else if(skill_trees[i].charAt(j) != skillChar.get(0)){
                        isChecked = false;
                        break;
                    }
                }
            }
            if(isChecked == true){
                answer += 1;
            }
        }
        System.out.println(answer);
        
        return answer;
    }
}