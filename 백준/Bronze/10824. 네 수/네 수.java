import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String a = br.readLine();
		String[]str=a.split(" ");
		long num1=Long.parseLong(str[0]+str[1]);
		long num2=Long.parseLong(str[2]+str[3]);
		System.out.println(num1+num2);
	}
}