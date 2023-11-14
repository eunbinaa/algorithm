import java.util.*;
class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder("");
        
        char a;
        
        for(int i=0; i<myString.length(); i++){
            a=myString.charAt(i);
            if(a>=97 && a<108){
                a='l';
            }
            answer.append(a);
        }
        return answer.toString();
    }
}