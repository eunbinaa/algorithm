class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        answer=new String[strArr.length];
        for(int i=0; i<strArr.length; i++){
            if(i==0 || i%2==0){
                answer[i]=strArr[i].toLowerCase();
            }else if(i%2!=0){
                answer[i]=strArr[i].toUpperCase();
            }
        }
        return answer;
    }
}