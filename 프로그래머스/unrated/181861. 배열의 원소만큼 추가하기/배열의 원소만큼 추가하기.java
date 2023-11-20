import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList <Integer> answer = new ArrayList<>();
        int sum=0;
        for(int i : arr){
            sum+=i;
        }
        System.out.println(sum);
        int[] answer2={};
        answer2=new int[sum];
       int count=0;
      
        for(int i=0; i<arr.length; i++){            
            for(int j=0; j<arr[i]; j++){                
                answer.add(arr[i]);               
            }       
        }
        
        for(int i=0; i<answer.size(); i++){
            answer2[i]=answer.get(i);
        }
        return answer2;
    }
}