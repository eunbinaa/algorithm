import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
     
        int count=0;
        int num=0;
        //for문 1 answer 배열 길이 알아내기
        for(int i=0; i<arr.length; i++){        
            if(arr[i]%divisor==0){ 
                count++;                
            }
        }
        
        if(count==0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[count];
        
        //for문 2 : answer배열에 넣기
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){               
                answer[num]=arr[i];
                num++;
            }
        }
        
        //배열 정렬
        Arrays.sort(answer);
        return answer;
    }
}