class Solution {
    public int solution(int n) {
        int answer = 0;
        String str="";        
        str=Integer.toString(n,3); 
        System.out.println(str);
        StringBuffer sb=new StringBuffer(str);
        String reverse=sb.reverse().toString();
        System.out.println(reverse);
        answer=Integer.parseInt(reverse,3);
        return answer;
    }
}