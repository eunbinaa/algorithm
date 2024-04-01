import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringBuilder sb=new StringBuilder();
		 int num= Integer.parseInt(br.readLine());
		 for(int i=0; i<num-1; i++) {
				for(int k=1; k<num-i; k++) {				
					sb.append(' ');				
				}
				for(int j=0; j<2*i+1; j++) {	
					if(j==0 || j==2*i) {
						sb.append('*');	
					}else {
						sb.append(' '); 	
					}
								
				}
				
				sb.append('\n');
			}
		  for(int j=0; j<num*2-1; j++) {
			  sb.append('*');
		  }
		 
		 System.out.println(sb.toString());
	}
}