import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		String[]str=br.readLine().split("-");
		for(int i=0; i<str.length; i++) {
			sb.append(str[i].charAt(0));
		}
		System.out.println(sb.toString());
	}
}