import java.util.*;
class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> count=new ArrayList();
        count.add(n);
        while(n>0){
            if(n==1){
             
                break;
                
            }else if(n%2!=0){
                n=3*n+1;
                count.add(n);
            }else{
              n/=2;   
              count.add(n);
            }
        }
        answer=new int[count.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=count.get(i);
        }
        return answer;
    }
}