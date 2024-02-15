import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int count=0;
        for(int i=0; i<=10; i++){
           if(arr.length<=Math.pow(2,i)){
               if(arr.length==Math.pow(2,i)){
                   return arr;
               }else{
                   int a=(int)Math.pow(2,i);
                   answer=new int[a];
                   for(int j=0; j<answer.length; j++){
                       if(count>=arr.length){
                           answer[j]=0;
                           count++;
                       }else{
                           answer[j]=arr[count];
                           count++;
                       }
                       
                   }                                   
                   break;
               }
           }
        }
        return answer;
    }
}