import java.util.*;
/*class Solution {
    public String solution(String my_string) {
       // String answer = my_string;
        StringBuilder sb=new StringBuilder(my_string);
        for(int i=0; i<sb.length(); i++){
            if(String.valueOf(sb.charAt(i)).equals("a")||
              String.valueOf(sb.charAt(i)).equals("e")||
              String.valueOf(sb.charAt(i)).equals("i")||
              String.valueOf(sb.charAt(i)).equals("o")||
              String.valueOf(sb.charAt(i)).equals("u")){
                sb.deleteCharAt(i);
                i=-1;
            }
        }
        return sb.toString();
    }
}*/
class Solution {
    public String solution(String my_string) {

        my_string = my_string.replace("a", "");
        my_string = my_string.replace("e", "");
        my_string = my_string.replace("i", "");
        my_string = my_string.replace("o", "");
        my_string = my_string.replace("u", "");

        return my_string;
    }
}
