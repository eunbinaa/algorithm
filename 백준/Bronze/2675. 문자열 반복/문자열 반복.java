import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A=Integer.parseInt(br.readLine());	
		StringBuilder sb= new StringBuilder("");		
		for(int i=0; i<A; i++) {
			String str=br.readLine();			
			str=str.replaceAll(" ", "");			
			int a=Integer.parseInt(str.substring(0,1));			
			str=str.substring(1);		
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<a; k++) {
					sb.append(String.valueOf(str.charAt(j)));					
				}
			}
			System.out.println(sb);
			sb.delete(0, sb.length());
		}
	
	}

}
