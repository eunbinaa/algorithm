import java.math.*;
class Solution {
    public int solution(int n, int t) {
        int answer = n;
   //    answer= n*(int)Math.pow(2,t);
        for(int i=1; i<=t; i++){
            answer=answer*2;
        }
        return answer;
    }
}