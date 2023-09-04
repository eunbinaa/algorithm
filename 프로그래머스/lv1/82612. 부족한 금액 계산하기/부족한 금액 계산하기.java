class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long ntimes=price;
        for(int i=2; i<=count; i++){
            ntimes+=price*i;
        }
        answer=money-ntimes;
        if(answer>=0){
            return 0;
        }else{
            return -answer;
        }
        
    }
}