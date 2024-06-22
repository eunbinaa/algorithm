import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		BigInteger xBig=new BigInteger(str,2);
		String str2=xBig.toString(8);
	       
		System.out.println(str2);
	}
}