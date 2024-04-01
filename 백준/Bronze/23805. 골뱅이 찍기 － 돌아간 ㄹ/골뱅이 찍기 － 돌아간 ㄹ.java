import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		StringBuilder sb=new StringBuilder();
		 int num= Integer.parseInt(br.readLine());
		
		 for(int i=0; i<num; i++) {
			 for(int j=0; j<5*num; j++) {		
				 if(j>5*num-(2*num)-1 && j<5*num-num) {
					 sb.append(' '); 
				 }else{
					 sb.append('@');
				 }
			 }
			 sb.append('\n');
		 }
		
		 for(int i=0; i<3*num; i++) {
			 for(int j=0; j<5*num; j++) {		
				 if(j<num || j>2*num-1 && j<2*num+num || j>5*num-num-1) {
					 sb.append('@'); 
				 }else{
					 sb.append(' ');
				 }
			 }
			 sb.append('\n');
		 }
		 for(int i=0; i<num; i++) {
			 for(int j=0; j<num*5; j++) {
				 if(j>num-1 && j<2*num) {
					 sb.append(' '); 
				 }else{
					 sb.append('@');
				 }
			 }
			   sb.append('\n');
		 }
		
		 System.out.println(sb.toString());
	}
}