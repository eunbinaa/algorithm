
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger x=new BigInteger(br.readLine(),2);
		x=x.multiply(BigInteger.valueOf(17));
		String binary=x.toString(2);
		System.out.println(binary);
	}
}