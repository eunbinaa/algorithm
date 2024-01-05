class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb=new StringBuilder("");
        for(int i=0; i<my_string.length(); i++){
            if(!sb.toString().contains(String.valueOf(my_string.charAt(i))))
                sb.append(String.valueOf(my_string.charAt(i)));
            
               
        }
        answer=sb.toString();
        return answer;
    }
}