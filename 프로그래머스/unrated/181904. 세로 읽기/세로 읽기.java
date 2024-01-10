class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int count=0;
        String[][] str=new String[my_string.length()/m][m];
        for(int i=0; i<str.length; i++){
            for(int j=0; j<m; j++){
                str[i][j]=String.valueOf(my_string.charAt(count));                             
                count++;
            }
           
        }
        
        for(int i=0; i<str.length; i++){           
                answer+=str[i][c-1];            
        }
        return answer;
    }
}