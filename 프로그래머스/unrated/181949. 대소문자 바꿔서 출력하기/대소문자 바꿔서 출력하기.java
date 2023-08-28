import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String anwser="";
        for(int i=0; i<a.length(); i++){
            char ch=a.charAt(i);
            int num=(int)ch;
            if(num>= 97 && num<=122){
                //소문자인 경우->대문자로 변환
                anwser+=a.valueOf(ch).toUpperCase();
            }else if(num>=65 && num<=90){
                //대문자의 경우 ->대문자로 변환
                anwser+=a.valueOf(ch).toLowerCase();
            }else{
                anwser+=(char)ch;
            }
        }
        System.out.println(anwser);
    }
}