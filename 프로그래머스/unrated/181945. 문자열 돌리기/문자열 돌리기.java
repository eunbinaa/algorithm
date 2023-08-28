import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList strArray=new ArrayList();
        //ArrayList 선언해서 str문자 하나씩 담기 (add)
        for(int i=0; i<str.length(); i++){
            strArray.add(str.charAt(i));
            
        }
        
        //리스트에 담겨진 값 하나씩 출력 (get)
        for(int k=0; k<strArray.size(); k++){
            System.out.println(strArray.get(k));
        }
    }
}