class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int count=0;
        String str=my_string.replaceAll("[^0-9]","");
        answer=new int[str.length()];
        for(int i=0; i<str.length(); i++){
            answer[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                int temp=0;
                if(answer[i]>answer[j]){
                    temp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=temp;
                }
            }
        }
        return answer;
    }
}