import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList <Integer> answer = new ArrayList<>();
        
        for(int i : numlist){
            answer.add(i);             
            
        }
        for(int i=0; i<answer.size(); i++){
            if(answer.get(i)%n!=0){
                 answer.remove(i);
                i=-1;
              
            }
        }
        int nums[]=new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            nums[i]=answer.get(i);
        }
        return nums;
    }
}