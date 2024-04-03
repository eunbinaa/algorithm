import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num= Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++) {
			BigInteger a = new BigInteger(br.readLine());
			
			if(a.mod(new BigInteger("2")).equals(new BigInteger("0"))) {
				sb.append("even");
				sb.append('\n');
			}else {
				sb.append("odd");
				sb.append('\n');
			}
		}
		 System.out.println(sb.toString());
		
		 
		 
	}
}