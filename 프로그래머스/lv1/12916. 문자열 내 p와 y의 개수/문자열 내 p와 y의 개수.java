class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_count=0;
        int y_count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==112 || s.charAt(i)==80){
                p_count++;
            }else if(s.charAt(i)==121 || s.charAt(i)==89){
                y_count++;
            }
        }
        if(p_count==y_count){
            answer=true;
        }else{
            answer=false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("p:"+p_count +"  and y:"+y_count);

        return answer;
    }
}