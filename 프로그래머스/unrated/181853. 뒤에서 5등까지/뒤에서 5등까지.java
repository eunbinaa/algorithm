class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        answer=new int[5];
        for(int i=0; i<num_list.length-1; i++){
            int temp=0;
            for(int j=i+1; j<num_list.length; j++){
                if(num_list[i]>num_list[j]){
                temp=num_list[j];
                num_list[j]=num_list[i];
                num_list[i]=temp;
            }
            }
            
        }

        for(int i=0; i<5; i++){
            answer[i]=num_list[i];
        }
        
        return answer;
    }
}