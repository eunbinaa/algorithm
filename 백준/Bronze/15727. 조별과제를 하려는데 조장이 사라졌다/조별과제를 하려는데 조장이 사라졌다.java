import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L=Integer.parseInt(br.readLine());
		int t=5;
		if(L%t==0) {
			System.out.println(L/t);
		}else{
			System.out.println((L/t)+1);
		}
		

	}

}