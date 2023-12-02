class Solution {
    public int solution(String myString, String pat) {        
        char c;
        String str="";
        for(int i=0; i<myString.length(); i++){
            c=myString.charAt(i);
            if(String.valueOf(c).equals("A")){
              str+="B";
                
            }else{
             str+= "A";
            }
        }      
        if(str.contains(pat)){
            return 1;
        }
        return 0;
    }
}