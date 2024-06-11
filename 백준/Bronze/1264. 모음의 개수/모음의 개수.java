import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int sum=0;
		while(true) {
			String str=br.readLine();
			if(str.equals("#")) {
				break;
			}else {
				String[] st=str.split("");
				for(int i=0; i<st.length; i++) {
					
					switch(st[i]) {
					case "a":
					case "A":
					case "e":
					case "E":
					case "i":
					case "I":
					case "o":
					case "O":
					case "u":
					case "U":
						sum++;
						break;
					 default:
						sum+=0;
						break;
			 		 }
			     	
				}
			
				sb.append(sum).append('\n');
				sum=0;
			}
		}
		
		System.out.println(sb.toString());
	}
}