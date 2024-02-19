import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        int[] answer = {};
          ArrayList<Integer> list = new ArrayList<>();
       
            for(int i=2; i<=n; i++){        
               while(n%i==0){
                   if(!list.contains(i)){
                        list.add(i);
                     
                    }
                     n/=i;
               }                               
                
               }                    
            
           
        return list;
    }
}