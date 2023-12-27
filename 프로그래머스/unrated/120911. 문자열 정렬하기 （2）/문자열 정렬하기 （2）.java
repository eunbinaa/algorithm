import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
       my_string=my_string.toLowerCase();
        String[] abc=new String[my_string.length()];
        for(int i=0; i<abc.length; i++){
            abc[i]=String.valueOf(my_string.charAt(i));
        }
        Arrays.sort(abc);
        for(String a : abc) answer+=a;
        return answer;
    }
}