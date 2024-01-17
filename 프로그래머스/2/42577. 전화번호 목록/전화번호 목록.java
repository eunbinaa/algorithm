import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;  
        int count=0;
        ArrayList<String> list= new ArrayList<>();
        for(int i=0; i<phone_book.length; i++){
            list.add(phone_book[i]);
        }
       
      //  Collections.sort(list, (String a, String b) -> a.length() - b.length());  //길이 최선+크기 차선
        // {12,123,1235,567,88} -> {12,88,123,567,1235} 순으로 정렬됨
         Collections.sort(list);  
   
       for(int i=0; i<list.size()-1; i++){   
            if(list.get(i+1).startsWith(list.get(i))) {        
                return false;
                }
             }
     
        return answer;
    }
}