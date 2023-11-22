class Solution {
    public int solution(String my_string, String is_prefix) {    
        int count=0;
        if(my_string.length()>=is_prefix.length()){
            for(int i=0; i<is_prefix.length(); i++){
            if(is_prefix.charAt(i)==my_string.charAt(i)){
                count++;
            }
         }
        }
        
        if(count==is_prefix.length()){
            return 1;
        }
        return 0;
    }
}