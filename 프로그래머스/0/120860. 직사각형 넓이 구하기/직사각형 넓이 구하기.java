import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int garo=0;
        int sero=0;
        for(int i=0; i<dots.length-1; i++){
            if(dots[i][0]!=dots[i+1][0]){
                garo=Math.abs(dots[i][0]-dots[i+1][0]);
                
            }
            
        }
        for(int i=0; i<dots.length-1; i++){
            if(dots[i][1]!=dots[i+1][1]){
                sero=Math.abs(dots[i][1]-dots[i+1][1]);
                
            }
            
        }
        
        
        
        return garo*sero;
    }
}