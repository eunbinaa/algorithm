class Solution {
    public int solution(int n) {
       int b=6;            
       int answer=0; 
       int commonDi=0; 
       commonDi=  gcdRec(n,b) ;     
       answer=(n*b)/commonDi/6;         
        return answer;
    }
    private static int gcdRec(int n, int b){
        
        int commonDivisor=0;
        if(n<b && n%b==0){
            return b;
        }else if(n>b && b%n==0){
            return n;
        }
        return gcdRec(b, n%b);
    }
}