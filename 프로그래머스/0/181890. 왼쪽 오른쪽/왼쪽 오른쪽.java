class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        int count=0;
        String[]str=new String[str_list.length];
        //배열을 따로 하나 더 만드는 건 비효율적이라고 판단해서 str_list만 이용해서 풀려고 했는데
        //테스트케이스에서 자꾸 몇개가 오류나서 결국 임시 배열 str을 생성했다.
        //임시 배열에 일단 넣고 count크키 만큼 다시 answer에 저장하는 방식.
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