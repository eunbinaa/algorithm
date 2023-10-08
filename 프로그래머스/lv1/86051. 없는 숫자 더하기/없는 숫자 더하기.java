class Solution {
    public int solution(int[] numbers) {
        int answer = 0+1+2+3+4+5+6+7+8+9;
       /* int[] num2={0,1,2,3,4,5,6,7,8,9};
        for(int i=0; i<numbers.length; i++){
            for(int k=0; k<num2.length; k++){
                if(numbers[i]==num2[k]){
                    answer-=numbers[i];
                }
            }
        }*/
        for(int i : numbers)
            answer-=i;
        return answer;
    }
}