import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};               
         answer=new int[commands.length];
        int[] temp={};
       
        for(int i=0; i<commands.length; i++){         
          //   Arrays.copyOfRange(원본 배열, 시작 위치, 마지막 위치);   
            temp=new int[commands[i][1]-commands[i][0]+1];
            temp=Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
             if(temp.length>1){                
               answer[i]=temp[commands[i][2]-1];
            }else{     
                 answer[i]=temp[0];
             }
        }
       
        return answer;
    }
}