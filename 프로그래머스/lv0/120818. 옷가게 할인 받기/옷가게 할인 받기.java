import java.math.*;
class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >=500000){
            answer=(int)Math.floor(price*0.8);
            
        }else if(price >=300000){
            answer=(int)Math.floor(price*0.9);
        }else if(price>=100000){
            answer=(int)Math.floor(price*0.95);
        }else{
            answer=price;
        }
       // System.out.println((int)Math.floor(price*0.95));
        return answer;
    }
}