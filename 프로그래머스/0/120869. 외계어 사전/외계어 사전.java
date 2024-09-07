class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i=0; i<dic.length; i++){
            for(int j=0; j<spell.length; j++){
                if(dic[i].contains(spell[j]) && j<spell.length-1){
                    continue;
                }else if(dic[i].contains(spell[j]) && j==spell.length-1){
                    answer++;
                }else{
                    break;
                }
             
            }
           
        }
        if(answer==0) answer=2;
        return answer;
    }
}