import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();	
		int sum=0;
	    for(int i=1; i<=5; i++) {
	    	String st = br.readLine();
	    	if(st.contains("FBI")) {
	    		sb.append(i);
	    		sb.append(" ");
	    		sum++;
	    	}
	    }
	    if(sum==0) {
	    	System.out.println("HE GOT AWAY!");
	    }else {
	    	 System.out.println(sb.toString());    	
	    }
	
		 
	}
}