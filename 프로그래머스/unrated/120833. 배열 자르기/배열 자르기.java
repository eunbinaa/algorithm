class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        answer=new int[num2-num1+1];
        int count=0;       
            for(int k=num1; k<=num2; k++ ){
                answer[count]=numbers[k];
                count++;
            }      
        return answer;
    }
}