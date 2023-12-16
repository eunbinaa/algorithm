import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList<String> str=new ArrayList();
        StringTokenizer st=new StringTokenizer(my_string, " ");
        int count=0;
        int tokenCount = st.countTokens();
        for(int i=0; i<tokenCount; i++){    
                str.add(st.nextToken());       
        }
        answer=new String[str.size()];
        for(int i=0; i<str.size(); i++){
            answer[i]=str.get(i);
                
        }
        return answer;
    }
}