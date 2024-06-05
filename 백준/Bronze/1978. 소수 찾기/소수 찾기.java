import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String str=br.readLine();
		int sum=0;
		int answer=0;
		StringTokenizer st= new StringTokenizer(str, " ");
		while(st.hasMoreTokens()) {
			int a=Integer.parseInt(st.nextToken());
			if(a==1) {
				continue;
			}
			for(int i=2; i<a; i++) {
				if(a!=1 && a%i==0) {
					sum++;
				}
				
			}
			if(sum==0) {
				answer++;
			}
			sum=0;
		}
	 System.out.println(answer);
	 
	}
}