import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		int sum=5;
		for(int i=2; i<=num; i++) {
			if(num==1) {
				break;
			}else {
				sum+=2*(i+1)+(i-1);
                sum%=45678;
			}
		}
		System.out.println(sum);
	}
}