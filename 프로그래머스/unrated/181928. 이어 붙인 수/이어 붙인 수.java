import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String zzak[]=new String[9];
        String hol[]=new String[9];
        int count=0;
        int count2=0;
        String zzakHop="";
        String holHop="";      
        //num_list 홀수, 짝수 구분해서 String변환 후 배열에 저장
            for(int i=0; i<num_list.length; i++){                               
             if((num_list[i]%2)==0){
               zzak[count]=String.valueOf(num_list[i]);
               count++;
             }else{
               hol[count2]=String.valueOf(num_list[i]);
               count2++;
             }                     
        
        }
        for(int k=0; k<zzak.length; k++){           
               
            if(zzak[k]==null){
                break;
            }else{
               zzakHop+=zzak[k];    
            }
        }
        
        for(int l=0; l<hol.length; l++){          
                 
              if(hol[l]==null){
                break;
            }else{
                   holHop+=hol[l];   
              }
        }
     answer=Integer.parseInt(zzakHop)+Integer.parseInt(holHop);
        return answer;  
       
    }
     
}