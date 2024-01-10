import java.util.*;
class Solution {
    public String solution(String s) {  
       
         StringTokenizer st = new StringTokenizer(s, " ",true);
         StringBuilder a=new StringBuilder("");
         String str="";
         
        while(st.hasMoreTokens()){              
            str=st.nextToken();
            if(str.equals(" ")){
               
            }else{
                str=str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase();
           
            }
             a.append(str);
           
            
        }
        
       
       return a.toString();
        
    }
}