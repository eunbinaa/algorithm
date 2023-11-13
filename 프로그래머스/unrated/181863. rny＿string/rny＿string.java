import java.util.*;
class Solution {
    public String solution(String rny_string) {
        StringBuilder answer = new StringBuilder("");
       
        for(int i=0; i<rny_string.length(); i++){
            char a =rny_string.charAt(i);
            
            if(a=='m'){
              String b=String.valueOf(a);
                b="rn";
                answer.append(b);
            }else{
                answer.append(a);
            }
            
        }
        return answer.toString();
    }
}