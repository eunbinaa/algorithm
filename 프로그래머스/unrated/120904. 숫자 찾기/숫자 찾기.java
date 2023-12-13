class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String a=String.valueOf(num);
        String b=String.valueOf(k);
        answer=a.indexOf(b);
        if(answer>=0){
            return answer+1;
        }
        else{
            return answer;
        }
        
    }
}