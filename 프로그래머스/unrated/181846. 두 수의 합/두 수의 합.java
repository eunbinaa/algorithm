import java.math.*;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger aa=new BigInteger(a);
         BigInteger bb=new BigInteger(b);
      //  System.ut.println(a.add(b));
        answer=String.valueOf(aa.add(bb));
        return answer;
    }
}