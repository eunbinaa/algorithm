import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;      
        Arrays.sort(d);
       for(int i : d){
           if(budget-i==0){
             answer++;
             break;              
           }else if(budget-i<0){           
               break;
           } else{
               budget-=i;
               answer++;
           }
       }
        
        return answer;
        
       }
}