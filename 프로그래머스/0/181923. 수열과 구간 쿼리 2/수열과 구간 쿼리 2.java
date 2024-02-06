import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer=new int[queries.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<arr.length; j++){
                 if(j>=queries[i][0] && j<=queries[i][1]){
                if(arr[j]>queries[i][2]){
                    list.add(arr[j]);
                }
              }
            }
            if(list.size()>0){
                Collections.sort(list);
                answer[i]=list.get(0);
                list.clear();
            }else{
                answer[i]=-1;
            }
            
        }
        return answer;
    }
}