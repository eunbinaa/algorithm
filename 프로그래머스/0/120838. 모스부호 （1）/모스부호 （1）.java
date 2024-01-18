class Solution {
    public String solution(String letter) {
        String answer = "";
        StringBuilder sb=new StringBuilder();
        String[] morse= {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] str=letter.split(" ");
        for(String abc : str){
           for(int i=0; i<morse.length; i++){
               if(abc.equals(morse[i])){
                   sb.append(Character.toString(i+'a'));
               }
           }
        }
        return sb.toString();
    }
}