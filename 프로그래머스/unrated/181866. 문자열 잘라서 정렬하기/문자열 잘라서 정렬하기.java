import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        StringTokenizer st=new StringTokenizer(myString,"x");
        int stSize=st.countTokens();
        answer=new String[stSize];
        int count=0;
        while(st.hasMoreTokens()){
            answer[count]=st.nextToken();
            count++;
        }
        Arrays.sort(answer);
        return answer;
    }
}