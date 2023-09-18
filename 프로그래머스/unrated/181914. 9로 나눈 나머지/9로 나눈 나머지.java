class Solution {
    public int solution(String number) {
        int i=0;
        int sum=0;
        int answer=0;
        while(i<number.length()){
           sum+=number.charAt(i)-'0';
            i++;
        }
        answer=sum%9;
        return answer;
    }
}