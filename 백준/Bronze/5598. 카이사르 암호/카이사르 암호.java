import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
		 String str =br.readLine();		 
	    for(int i=0; i<str.length(); i++) {
	    	char c= str.charAt(i);
	    	if((int)c-3<65) {
	    		sb.append((char)((int)c+23));
	    	}else {
	    		sb.append((char)((int)c-3));
	    	}
	    
	    }
	    System.out.println(sb.toString());
	}
}