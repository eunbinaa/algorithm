class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String reverse="";
        
        for(int i=e; i>=s; i--){
            reverse+=my_string.charAt(i);
        }        
        answer=my_string.substring(0,s)+reverse+my_string.substring(e+1);
        return answer;
    }
}