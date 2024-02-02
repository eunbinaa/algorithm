class Solution {
    public int solution(int[] numbers, int k) {      
        int count=0;
        for(int i=0; i<k-1; i++){            
             count+=2;
            if(count>numbers.length){
                count-=numbers.length;
            }
           
        }
        
        return numbers[count];
    }
}