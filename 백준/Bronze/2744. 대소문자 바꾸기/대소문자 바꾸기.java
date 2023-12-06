import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str=br.readLine();
			String answer="";
			for(int i=0; i<str.length(); i++){
	            if(str.charAt(i)>=65 && str.charAt(i)<=90){	               
	                answer+=String.valueOf(str.charAt(i)).toLowerCase();
	            }else{           
	               answer+= String.valueOf(str.charAt(i)).toUpperCase();
	            }
	        }
	       System.out.println(answer);;

	}

}
