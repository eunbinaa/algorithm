import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int num=Integer.parseInt(br.readLine());
		for(int i=2; i<=num; i++) {
			if(num==0) {
				break;
			}else {
				if(num%i==0) {
					num/=i;
					sb.append(i).append('\n');
					i-=1;
				}else {
					continue;
				}
			}
		}
	     
		System.out.println(sb.toString());
	}
}