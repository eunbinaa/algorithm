import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String st = br.readLine();
	    String[] str=st.split("");
	    int a=0;
	    int b=0;
	    for(int i=0; i<str.length; i++) {
	    	if(str[i].equals("A")) a++;
	    	else b++;
	    }
	   if(a>b) {
		   System.out.println("A");
	   }else if(a<b) {
		   System.out.println("B");
	   }else {
		   System.out.println("Tie");
	   }
			
	
		 
	}
}