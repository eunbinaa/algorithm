import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList <Integer> nums=new ArrayList();
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                nums.add(numbers[i]+numbers[j]);
            }
        }
        Set <Integer> set = new HashSet<Integer>(nums);
        ArrayList <Integer> newNums=new ArrayList <Integer>(set);
        
        answer=new int[newNums.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=newNums.get(i);
        }
         for(int i=0; i<answer.length-1; i++){
            for(int j=i+1; j<answer.length; j++){
                int temp=0;
                if(answer[i]>answer[j]){
                    temp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=temp;
                }
            }
        }
        
        return answer;
    }
}