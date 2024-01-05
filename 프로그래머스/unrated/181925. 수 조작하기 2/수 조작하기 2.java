class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=0; i<numLog.length-1;  i++){
            for(int j=i+1; j<=i+1; j++){               
                if(numLog[i]+1==numLog[j]){
                    answer+="w";
                }else if(numLog[i]-1==numLog[j]){
                    answer+="s";
                }else if(numLog[i]+10==numLog[j]){
                    answer+="d";
                }else if(numLog[i]-10==numLog[j]){
                    answer+="a";
                }
            }
        }
        return answer;
    }
}