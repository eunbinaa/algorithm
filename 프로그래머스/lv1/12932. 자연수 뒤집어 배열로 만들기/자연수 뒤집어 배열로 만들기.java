class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        String giri=String.valueOf(n);
        int giri_n=giri.length();
        answer=new int[giri_n];
        int count=0;
        for(int i=giri_n-1; i>=0; i--){
            answer[count]=Integer.parseInt(String.valueOf(giri.charAt(i)));
            count++;
        }
        return answer;
    }
}