class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        answer=new int[2];
        int temp=array[0];
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(temp<array[j]){
                    temp=array[j];
                }
            }
        }
        for(int i=0; i<array.length; i++){
            if(array[i]==temp){
                answer[1]=i;
            }
        }
       answer[0]=temp;
      
       return answer;
        
    }
}