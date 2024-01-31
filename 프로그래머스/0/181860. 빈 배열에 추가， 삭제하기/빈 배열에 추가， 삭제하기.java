import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> list= new ArrayList<>();
        Stack<Integer> st =new Stack<>();
        for(int i=0; i<flag.length; i++){
            if(flag[i]==true){
                for(int j=0; j<2*arr[i]; j++){
                    st.add(arr[i]);               
                      }
                }else{
                    for(int j=0; j<arr[i]; j++){
                        st.pop();
                    }
            }
        }       
        answer=new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            answer[i]=st.pop();
        }
        return answer;
    }
}