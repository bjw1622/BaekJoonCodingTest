import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.substring(i,i+1).equals(" ")){
                str+=" ";
                if(i==s.length()-1) list.add(str);
            }else{
                if(!str.equals("")){
                    list.add(str);
                }
                str="";
            }
        }
        int n = 0;
        if(s.substring(0,1).equals(" ")){
            answer+= list.get(n++);
        }
        String[] ar = s.split(" ");
        for(int i=0;i<ar.length;i++){
            System.out.println("z"+ar[i]+"z");
        }
        for(int i =0; i< s.split(" ").length;i++){
            for(int j=0; j<s.split(" ")[i].length();j++){
                if(j==0){
                    answer += Character.toUpperCase(s.split(" ")[i].charAt(j));
                    if(s.split(" ")[i].length() == 1){
                        if(n<list.size()){
                            answer+=list.get(n++);
                        }
                    }
                }
                else if(j==s.split(" ")[i].length()-1 && i != s.split(" ").length-1){
                    answer += Character.toLowerCase(s.split(" ")[i].charAt(j))+list.get(n++);
                }
                else{
                    answer += Character.toLowerCase(s.split(" ")[i].charAt(j));
                }
            }
        }
        if(n==list.size()-1){
            answer+=list.get(n);
        }
        System.out.println(answer);
        return answer;
    }
}