class Solution {
    public int solution(String my_string, String is_suffix) {
        int sum=0;
        int count=is_suffix.length()-1;
        if(my_string.length()>=is_suffix.length()){
            for(int i=my_string.length()-1; i>=my_string.length()-is_suffix.length(); i--){
                if(is_suffix.charAt(count)==my_string.charAt(i)){
                        sum++;
                        count--;
                    }else{
                        break;
                    }                
            }
                
        }
        if(sum==is_suffix.length()){
            return 1;
        }  
        return 0;
            
    }
}