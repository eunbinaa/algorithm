import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String nTostr=String.valueOf(n); //n 문자열로 형변환
        int giri=nTostr.length();//문자열 nTostr의 길이
        Integer arr[]=new Integer[giri]; //길이가 10인 배열 arr 생성. 
        //이때 배열은 int가 아니라 Integer 래퍼 클래스로 생성해야함. int 타입은 내림차순 정렬을 못 한다
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