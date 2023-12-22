class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        if(direction.equals("right")){
            int temp=numbers[numbers.length-1];          
            for(int i=numbers.length-2; i>=0; i--){
                for(int j=i+1; j>i; j--){
                    numbers[j]=numbers[i];                   
                }
            }
             numbers[0]=temp;
        }else{
            int temp=numbers[0]; 
             for(int i=1; i<numbers.length; i++){
                for(int j=i-1; j<i; j++){
                    numbers[j]=numbers[i];                   
                }
            }
            numbers[numbers.length-1]=temp;
        }
        return numbers;
    }
}