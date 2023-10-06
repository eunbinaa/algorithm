class Solution {
    public int solution(int num) {
        int answer = 0;
        if(num==1){
            return 0;
        }
        while(true){
            if(answer>480){
            return -1;
          }
            if(num%2==0){
                num/=2;
                
                if(num==1){
                    answer++;
                    break;
                  
                }
                answer++;
                continue;
            }else{
                num=(num*3)+1;
                
                if(num==1){
                    answer++;
                    break;
                    
                }
                answer++;
                continue;
            }
          
        }
       
        return answer;
    }
}