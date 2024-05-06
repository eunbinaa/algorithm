import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        answer=new String[picture.length*k];
        StringBuilder sb= new StringBuilder("");
        int count=0;
        for(int i=0; i<picture.length; i++){
            for(int j=0; j<picture[i].length(); j++){
                for(int l=1; l<=k; l++){
                    sb.append(picture[i].charAt(j));
                }    
                
            }
            for(int m=1; m<=k; m++){
                 answer[count]=sb.toString();
                 count++;
            }

                sb.delete(0, sb.length());
        }
        return answer;
    }
}