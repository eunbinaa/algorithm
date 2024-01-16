class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        answer=new int[2];
        int width=0;
        int length=0;     
        int sum=brown+yellow;       
            for(int i=1; i<=brown; i++){
                for(int j=1; j<=brown; j++){
                    if(i*j==yellow && j>=i){                     
                            length=i;
                             width=j;
                            
                        if(width*length+width*2+length*2+4==sum){
                           
                              answer[0]=width+2;
                              answer[1]=length+2;
                        }
                          
                        
                    }
                }
            }        
        return answer;
    }
}