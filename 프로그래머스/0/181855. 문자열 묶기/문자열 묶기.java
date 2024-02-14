import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<strArr.length; i++){
            int num=strArr[i].length();
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] sizes=new int[map.size()];
        int count=0;
        for(int i : map.keySet()){
            int value=map.get(i);
            sizes[count]=value;
            count++;
        }
        Arrays.sort(sizes);
       
        return sizes[sizes.length-1];
    }
}