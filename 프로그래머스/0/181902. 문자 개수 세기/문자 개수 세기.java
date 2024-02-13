class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        answer=new int[52];
        
        for(int i=0; i<my_string.length(); i++){
             char a=my_string.charAt(i);
            if(a<97){
                answer[a-65]+=1;
            }else{
                answer[a-71]+=1;
            }
        }
        return answer;
    }
}