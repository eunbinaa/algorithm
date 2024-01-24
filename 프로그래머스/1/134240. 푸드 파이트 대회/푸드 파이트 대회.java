class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            if(food[i]%2!=0){
                food[i]-=1;             
            }
            
             for(int j=0; j<food[i]/2; j++)
                answer+=String.valueOf(i);
        }
       
        String str="";
        for(int i=answer.length()-1; i>=0; i--) str=str+answer.charAt(i);
      
        answer=answer+"0"+str;
        return answer;
    }
}