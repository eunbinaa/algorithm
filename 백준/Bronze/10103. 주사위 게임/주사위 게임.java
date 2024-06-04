import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=100;
		int b=100;
		int num=Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			String[]str=br.readLine().split(" ");
			if(Integer.parseInt(str[0])<Integer.parseInt(str[1])) {
				a-=Integer.parseInt(str[1]);
			}else if(Integer.parseInt(str[0])>Integer.parseInt(str[1])) {
				b-=Integer.parseInt(str[0]);
			}
		}
		System.out.println(a);
		System.out.println(b);
	}
}