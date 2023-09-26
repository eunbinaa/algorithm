class Solution {
    public int solution(int order) {
        int answer = 0;
        String orr=String.valueOf(order);
        for(int i=0; i<orr.length(); i++){          
            if(orr.charAt(i)=='3' || orr.charAt(i)=='6' || orr.charAt(i)=='9'){
                answer++;
            }
        }
        return answer;
    }
}