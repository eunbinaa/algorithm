import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList <Integer>ans = new ArrayList();
        int [] answer={};
        for(int i=0; i<arr.length; i++){
            ans.add(arr[i]);
        }
        for(int i=0; i<delete_list.length; i++){
            for(int j=0; j<ans.size(); j++){
                if(delete_list[i]==ans.get(j)){
                    ans.remove(j);
                    j=-1;
                }
            }
        }
        answer= new int[ans.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=ans.get(i);
        }
        
        return answer;
    }    
}