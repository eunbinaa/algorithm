import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringBuilder sb=new StringBuilder();
		 int num= Integer.parseInt(br.readLine());
		 for(int i=0; i<4*num; i++) {
			 for(int j=0; j<num; j++) {				
					 sb.append('@');				 
			 }
			 sb.append('\n');
		 }
		 for(int i=0; i<num; i++) {
			 for(int j=0; j<num*5; j++) {
				 sb.append('@');
			 }
			   sb.append('\n');
		 }
		 
		 
		 System.out.println(sb.toString());
	}
}