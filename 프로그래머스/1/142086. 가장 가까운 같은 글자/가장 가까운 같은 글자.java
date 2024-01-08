class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        answer=new int[s.length()];
        String str="";
        for(int i=0; i<s.length(); i++){
            if(!str.contains(String.valueOf(s.charAt(i)))){
                answer[i]=-1;
                str+=s.charAt(i);
            }else{               
                answer[i]=i-str.lastIndexOf(s.charAt(i));
                str+=s.charAt(i);
            }
        }
     
        return answer;
    }
}