class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int count=0;
        answer=new int[intervals[0][1]-intervals[0][0]+1+intervals[1][1]-intervals[1][0]+1];
        for(int i=0; i<2; i++){
            for(int j=intervals[i][0]; j<=intervals[i][1]; j++){
                answer[count]=arr[j];
                count++;
            }
        }
        return answer;
    }
}