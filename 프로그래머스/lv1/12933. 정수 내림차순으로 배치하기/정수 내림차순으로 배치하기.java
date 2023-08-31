import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nTostr=String.valueOf(n);
        int giri=nTostr.length();
        Integer arr[]=new Integer[giri]; 
        
        for(int i=0; i<giri; i++){
            arr[i]=Integer.parseInt(String.valueOf(nTostr.charAt(i)));
        }
        //내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        String moon="";
        for(int k=0; k<arr.length; k++){
              moon+=arr[k];          
        }
        answer=Long.parseLong(moon);
        return answer;
    }
}