class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int giri=num_list.length;
        int last=0;
        answer= new int[giri+1];
        for(int i=0; i<num_list.length; i++){
            if(num_list[giri-1]>num_list[giri-2]){
                last=num_list[giri-1]-num_list[giri-2];
            }else{
                last=2*num_list[giri-1];
            }
        }
        for(int k=0; k<answer.length-1; k++){
            answer[k]=num_list[k];
            
        }
         answer[answer.length-1]=last;
            
        return answer;
    }
}