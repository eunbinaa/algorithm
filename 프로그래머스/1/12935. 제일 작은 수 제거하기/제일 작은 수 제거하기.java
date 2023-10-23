import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer ={};
        int[] arr2= new int[arr.length];      
     
        for(int i=0; i<arr.length; i++){
            arr2[i]=arr[i];
        }
    
        Arrays.sort(arr2);
               
        int num=0;
               
        if(arr.length==1){
         answer=new int[1];
         answer[0]=-1;  
            return answer;
        }else{
            answer=new int[arr.length-1];
            for(int i=0; i<arr.length; i++){
                if(arr[i]==arr2[0]){
                    num=i;
                    break;
                }
            }
           System.arraycopy(arr, 0, answer, 0, num);
           System.arraycopy(arr, num + 1, answer, num, arr.length-num-1);
       
        }         
        return answer;
    }
}