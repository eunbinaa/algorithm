import java.util.*;
class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder("");
        char a;   
        myString= myString.toLowerCase();
        for(int i=0; i<myString.length(); i++){
            a=myString.charAt(i);
            if(a=='a'){
                 a='A';
              }
            answer.append(a);
            }
       
        return answer.toString();
    }
       
}