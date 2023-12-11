import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        ArrayList <Integer>nums=new ArrayList<>();
        int a=n;
        int count=n+1;
        answer=new int[num_list.length];
        for(int i=0; i<num_list.length-n; i++){
            nums.add(num_list[a]);
            a++;           
        }
        
        for(int i=0; i<n; i++){
            nums.add(num_list[i]);
        }
        for(int i=0; i<nums.size(); i++){
            answer[i]=nums.get(i);
        }
         return answer;
    }
}