import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hop=0;
        int gop=1;
        for(int i=0; i<num_list.length; i++){
          hop+=num_list[i];
          gop*=num_list[i];
        }
        if(hop*hop>gop){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
}