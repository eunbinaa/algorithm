import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double bi = Double.parseDouble(br.readLine());
		bi=Math.sqrt(bi);
		System.out.printf("%f",bi*4);
	}
}