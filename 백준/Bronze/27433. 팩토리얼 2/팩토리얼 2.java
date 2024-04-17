import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		BigInteger a=new BigInteger("1");
		BigInteger b=new BigInteger("1");
		for(int i=1; i<=num; i++) {
			a= a.multiply(BigInteger.valueOf(i));			
		}
		System.out.println(a);
	}
}