class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] nums={};
        nums=new int[included.length];
        for(int i=0; i<nums.length; i++){
            nums[i]=a;
            a+=d;
        }
        for(int i=0; i<nums.length; i++){
            if(included[i]==true){
                answer+=nums[i];
            }
        }
        return answer;
    }
}