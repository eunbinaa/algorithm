class Solution {
    public String solution(int[] numLog) {
        String answer = "";
       /* for(int i=0; i<numLog.length-1;  i++){
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
        }*/
        for(int i=1; i<numLog.length; i++){
            int j=numLog[i-1]-numLog[i];
            switch(j){
                case -1:
                    answer+="w"; break;
                case -10:
                    answer+="d"; break;
                case 10:
                    answer+="a"; break;
                case 1:
                    answer+="s"; break;
            }
        }
        return answer;
    }
}