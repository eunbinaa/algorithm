import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
         int target = 2;
        int index=0;
        int lastIndex=0;
        for (int i = 0; i < arr.length; i++) {
         if (arr[i] == target) {
        index = i;
        break;  
        }else{
             index=-1;
         }
        }
        
         for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                lastIndex = i;
                break;  
            }else{
                lastIndex=-1;
            }
        }
       
        int count=0;
        if(index==-1 || lastIndex ==-1){
            answer=new int[1];
            answer[0]=-1;
        }else{
            int length=lastIndex-index+1;
             answer=new int[length];
            for(int i=index; i<=lastIndex ; i++){
            answer[count]=arr[i];
            count++;
           }
        }
  
        return answer;
    }
}