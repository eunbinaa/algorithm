import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;  
        int count=0;
        ArrayList<String> list= new ArrayList<>();
        for(int i=0; i<phone_book.length; i++){
            list.add(phone_book[i]);
        }
       
         Collections.sort(list);  
        for(int i=0; i<list.size()-1; i++){                         
              if(list.get(i+1).startsWith(list.get(i))) {
                  answer= false;      
                  break;
              }
             }
     
        return answer;
    }
}