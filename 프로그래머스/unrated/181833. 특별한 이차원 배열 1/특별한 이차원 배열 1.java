class Solution {
    public int[][] solution(int n) {
        int[][] answer = {};
        answer=new int[n][n];
        for(int i=0; i<answer.length; i++){
            for(int k=0; k<answer[i].length; k++){
                if(i==k){
                     answer[i][k]=1;
                }else{
                     answer[i][k]=0;
                }
               
            }
        }
        return answer;
    }
}