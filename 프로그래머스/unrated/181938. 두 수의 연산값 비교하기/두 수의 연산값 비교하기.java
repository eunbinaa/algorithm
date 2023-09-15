class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int boot= Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int gop=2*a*b;
        if(boot>gop){
            return boot;
        }else if(boot<gop){
            return gop;
        }else{
           return answer; 
        }
        
    }
}