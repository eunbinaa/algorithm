import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		while(true) {
			String a=br.readLine();
			if(a.equals("***")) {
				break;
			}else {
				String reverse="";
				for(int i=a.length()-1; i>=0; i--) {
					reverse = reverse + a.charAt(i);
				
				}
				sb.append(reverse);
				sb.append('\n');
			}
		}
       System.out.println(sb.toString());
	    
	}
}