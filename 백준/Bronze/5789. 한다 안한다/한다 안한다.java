import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());		
		int sum=0;
	    for(int i=0; i<num; i++) {
	    	String st = br.readLine();
	    	if(st.charAt(st.length()/2-1)==st.charAt(st.length()/2)) {
	    		sb.append("Do-it");
	    		sb.append('\n');
	    		
	    	}else {
	    		sb.append("Do-it-Not");
	    		sb.append('\n');
	    	}
	    }
	    System.out.println(sb.toString());
	}
}