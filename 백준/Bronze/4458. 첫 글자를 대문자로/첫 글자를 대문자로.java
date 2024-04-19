
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String a = br.readLine();
			a=a.substring(0, 1).toUpperCase()+a.substring(1);
			sb.append(a+'\n');
		}
		System.out.println(sb.toString());
	}
}