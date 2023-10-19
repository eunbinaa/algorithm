class Solution {
    public String solution(String my_string, String letter) {       
        StringBuilder sb=new StringBuilder(my_string);   
        for(int i=0; i<sb.length(); i++){
            if(String.valueOf(sb.charAt(i)).equals(letter)){
             sb.deleteCharAt(i);
             i=-1;
            }
        }
      
        return sb.toString();
    }
}
