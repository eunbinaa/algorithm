class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //int -> String 형변환 : String.valueOf(a);
        String first=String.valueOf(a)+String.valueOf(b);
        String back=String.valueOf(b)+String.valueOf(a);
        int ab=Integer.parseInt(first);
        int ba=Integer.parseInt(back);
        if(ab>ba){
            answer=ab;
        }else if(ab==ba){
            answer=ab;
        }else{
            answer=ba;
        }
        
        return answer;
    }
}