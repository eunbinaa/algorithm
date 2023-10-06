class Solution {
    public long solution(long n) {
        long answer = 0;
        for(long i =1; i<=n; i++){
            if(i*i==n){
                answer=(i+1)*(i+1);
                break;
            }else if(i==n){
               answer=-1;
            }else{
                continue;
            }
        }
        return answer;
    }
}