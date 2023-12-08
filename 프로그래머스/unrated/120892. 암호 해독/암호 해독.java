import java.util.*;
class Solution {
    public String solution(String cipher, int code) {
        int newCode=0;
        int originCode=0;
        newCode=code-1;
        originCode=code;
        StringBuilder answer = new StringBuilder("");
        for(int i=0; i<cipher.length(); i++){
            if(i==newCode){
                answer.append(String.valueOf(cipher.charAt(newCode)));
                newCode+=originCode;
            }else{
                continue;
            }
            
        }
        return answer.toString();
    }
}