class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int num=0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                num=i;
                break;
            }else{
                continue;
            }
        }
        String num2=String.valueOf(num);
        answer="김서방은 " + num2+"에 있다";
        return answer;
    }
}