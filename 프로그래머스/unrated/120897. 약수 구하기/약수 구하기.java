import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> nums=new ArrayList();
        int[] answer = {};
        for(int i = 1; i <= n; i++){
	    if(n % i == 0) nums.add(i);
}
        answer=new int[nums.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=nums.get(i);
        }
        return answer;
    }
}