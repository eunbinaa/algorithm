class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a,b,c=0;
       
            if(hp%5==0){
                answer=hp/5;                
            }else{
                a=hp/5;              
                if((hp%5)%3==0){                  
                    answer=a+(hp%5/3);                  
                }else{                 
                    b=hp%5/3;                    
                    c=hp%5%3;                  
                    answer=a+b+c;                 
                }
            }
        
        return answer;
    }
}