import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[]str=br.readLine().split(" ");
			int a=Integer.parseInt(str[0]);
			sb.append(str[1].substring(0,a-1)+str[1].substring(a)).append('\n');
		}
		System.out.println(sb.toString());
	}
}