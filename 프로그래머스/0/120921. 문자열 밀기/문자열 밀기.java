class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        if(A.equals(B)){
        return 0;
            }
        while(true){
            String temp=(String.valueOf(A.charAt(A.length()-1)));
            A=temp+A.substring(0,A.length()-1);
            answer++;
            if(A.equals(B)){              
                break;
            }
            if(answer>A.length()){
                return -1;
            }
        }
        return answer;
    }
}