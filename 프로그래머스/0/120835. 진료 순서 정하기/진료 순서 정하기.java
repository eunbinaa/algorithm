import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = {};
        answer=new int[emergency.length];
        int[]arr=new int[emergency.length];
        for(int i=0; i<arr.length; i++){
            arr[i]=emergency[i];
        }
        Arrays.sort(arr);
        HashMap<Integer,Integer> map= new HashMap<>();
        int count=1;
        for(int i=arr.length-1; i>=0; i--){
            map.put(arr[i],count);
            count++;
        }
       int inx=0;       
       for(int key : map.keySet()){
           for(int i=0; i<arr.length; i++){
               if(emergency[i]==key){
                answer[i]=map.get(key);
            }
           }
           
        }     
    
        return answer;
    }
}