import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
	   while(true) {
		   String[]str=br.readLine().split(" ");
		   if(str[0].equals("0")&& str[1].equals("0")) {
			   break;
		   }
		   if(Integer.parseInt(str[1])%Integer.parseInt(str[0])==0) {
			   sb.append("factor").append('\n');
		   }else if(Integer.parseInt(str[0])%Integer.parseInt(str[1])==0) {
			   sb.append("multiple").append('\n');
		   }else {
			   sb.append("neither").append('\n');
		   }
	   }
	   System.out.println(sb.toString());
	}
}