import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {}; //배열 선언
        answer=new int[end_num-start_num+1]; //배열 생성      
        int count=0;
        for(int i=start_num; i<=end_num; i++){   
             
            answer[count]=i;
            count++;
        }
        return answer;
    }
}