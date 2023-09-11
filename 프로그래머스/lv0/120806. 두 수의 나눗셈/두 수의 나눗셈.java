import java.util.*;
class Solution {
    public int solution(int num1, int num2) {
        double abc = (double)num1/(double)num2;
        int answer=(int)Math.floor(abc*1000);
        return answer;
    }
}