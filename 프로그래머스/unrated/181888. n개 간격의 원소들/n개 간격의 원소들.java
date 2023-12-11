class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int count=0;      
        if(num_list.length%n==0){
            answer=new int[num_list.length/n];
            
            for(int i=0; i<num_list.length; i+=n){
                answer[count]=num_list[i];
                count++;
            }
            
        }else{
            answer=new int[num_list.length/n+1];
            answer[0]=num_list[0];
            for(int i=0; i<num_list.length; i+=n){
                answer[count]=num_list[i];
                count++;
            }
        }
   
        return answer;
    }
}