import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min=0;
        int nums[] =new int[array.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0; i<array.length; i++){         
                 nums[i]=Math.abs(n-array[i]);                 
        }          
        Arrays.sort(nums);           
        for(int i=0; i<array.length; i++){
             if(Math.abs(array[i]-n)==nums[0] ){
               list.add(array[i]);
                }
             }
      Collections.sort(list);
        return list.get(0);           
        }        
       
}