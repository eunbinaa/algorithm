import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[]str=br.readLine().split(" ");
			sum+=Integer.parseInt(str[1])%Integer.parseInt(str[0]);
		}
		
		System.out.println(sum);
	}
}