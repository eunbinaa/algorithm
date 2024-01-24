class Solution {
    boolean solution(String s) {      
        int b=0;
        int a=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(') a++;
            else if(s.charAt(i)==')') b++;
            if(a<b) return false;
        }
        if(a==b){
            return true;
        }else{
            return false;
        }
    }
}