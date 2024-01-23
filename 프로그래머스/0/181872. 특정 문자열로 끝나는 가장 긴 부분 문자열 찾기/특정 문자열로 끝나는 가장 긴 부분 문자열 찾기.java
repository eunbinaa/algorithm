class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int inx=myString.lastIndexOf(pat);       
        int length=pat.length();
        answer=myString.substring(0,inx+length);
        return answer;
    }
}