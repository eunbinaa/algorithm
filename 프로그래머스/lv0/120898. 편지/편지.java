class Solution {
    public int solution(String message) {
        int answer = 0;
        String msg[]=message.split("");
        answer=2*msg.length;
        return answer;
    }
}