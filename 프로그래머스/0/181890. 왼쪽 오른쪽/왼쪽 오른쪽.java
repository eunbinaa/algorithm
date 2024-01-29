class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int count=0;
        String[]str=new String[str_list.length];
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
               
                for(int k=0; k<i; k++){                   
                    str[count]=str_list[k];
                    count++;
                }
                break;
            }else if(str_list[i].equals("r")){
                  
                for(int k=i+1; k<str_list.length; k++){                 
                   str[count]=str_list[k];
                    count++;
                }
                break;
            }
        }
        answer=new String[count];
        for(int i=0; i<answer.length; i++){
            answer[i]=str[i];
        }
        return answer;
    }
}