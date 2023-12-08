import java.util.*;
class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";    
        if(my_string.contains(alp)){
           int a=0;
            for(int i=0; i<my_string.length(); i++){
                String str=String.valueOf(my_string.charAt(i));
                if(String.valueOf(my_string.charAt(i)).equals(alp)){
                    answer+=alp.toUpperCase();
                }else{
                    answer+=str;
                }
            }                   
        }else{
            answer=my_string;
        }
        return answer;
    }
}